package com.xworkz.project.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintValidatorContext.ConstraintViolationBuilder;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.engine.ConstraintViolationImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.repository.ProjectRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private ProjectRepository projectRepository;

	String resetPassword = DefaultPasswordGenerator.generate(6);

	public ProjectServiceImpl() {
		log.info("created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<ProjectDTO>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto" + dto);
			return violations;
		} else {
			log.info("violation is not there in dto,can save");

			Long count = this.projectRepository.findCountByEmailAndUserIdAndMobile(dto.getEmail(), dto.getUserId(),
					dto.getMobile());
//			if (count == 0) {

			ProjectEntity entity = new ProjectEntity();
			entity.setCreatedBy(dto.getUserId());
			entity.setCreatedDate(LocalDateTime.now());
			entity.setUserId(dto.getUserId());
			entity.setEmail(dto.getEmail());
			entity.setMobile(dto.getMobile());
			entity.setPassword(passwordEncoder.encode(dto.getPassword()));
			entity.setPasswordChangedTime(LocalTime.of(0, 0, 0));
			entity.setResetPassword(false);

			// BeanUtils.copyProperties(dto, entity);

			boolean saved = this.projectRepository.save(entity);
			boolean sent = sendMail("rghiremath26@gmail.com");
			log.info("Entity data is saved" + saved);
			log.info("email sent" + sent);

//			} 
//			else {
//				System.err.println("data already exists");
//				return null;
//			}

			return Collections.emptySet();
		}
	}

	@Override
	public Long findByEmail(String email) {
		Long emailcount = this.projectRepository.findByEmail(email);
		log.error("Find  by Email");
		return emailcount;
	}

	@Override
	public Long findByUser(String user) {
		Long userCount = this.projectRepository.findByUser(user);
		return userCount;
	}

	@Override
	public Long findByMobile(Long mobile) {
		Long mobilecount = this.projectRepository.findByMobile(mobile);
		return mobilecount;
	}

	@Override
	public ProjectDTO userSignIn(String userId, String password) {

		ProjectEntity entity = this.projectRepository.userSignIn(userId);
		ProjectDTO dto = new ProjectDTO();
		BeanUtils.copyProperties(entity, dto);

		log.info("matching-----" + passwordEncoder.matches(password, entity.getPassword()));
		log.info("Time matching--" + entity.getPasswordChangedTime().isAfter(LocalTime.now()));
		log.info("Now Present Time--" + LocalTime.now());
		log.info("PasswordChangedTime--" + entity.getPasswordChangedTime());

		log.info("Time " + LocalTime.now().isBefore(entity.getPasswordChangedTime()));
		if (entity.getLockcount() >= 3) {
			log.info("Running in Login count condition");
			return dto;
		}

		if (dto.getUserId().equals(userId) && passwordEncoder.matches(password, entity.getPassword())) {
			log.info("Running userId matching and password mathing");
			return dto;
		} else {

			this.projectRepository.onlock(userId, entity.getLockcount() + 1);
			log.info("count of login" + entity.getLockcount() + 1);
			return null;
		}

	}

	@Override
	public boolean sendMail(String email) {
		String portNumber = "587";// 485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "sangeetha642@outlook.com";
		String password = "sangeetha@642";
		String to = email;

		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", 587);
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.debug", "true");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.transport.protocol", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}

		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration  Completed");
			message.setText("Thanks for registration");
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent sucessfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public ProjectDTO resetPassword(String email) {
		log.info("Reset password--" + resetPassword);

		log.info("Running resetpassword in service impl " + email);

		ProjectEntity entity = this.projectRepository.resetPassword(email);

		if (entity != null) {
			log.info("entity found in email" + email);
			entity.setPassword(passwordEncoder.encode(resetPassword));
			entity.setUpdateBy("System");
			entity.setUpdateDate(LocalDateTime.now());
			entity.setLockcount(0);
			entity.setResetPassword(true);
			entity.setPasswordChangedTime(LocalTime.now().plusSeconds(120));

			boolean update = this.projectRepository.update(entity);
			log.info("Data updated in database");

			log.info("Password updated in entitty " + resetPassword);
			if (update) {

				sendMail(entity.getEmail(), "Your reset password is" + resetPassword);
			}
			log.info("Updated---" + update);
			ProjectDTO updatedDto = new ProjectDTO();
			BeanUtils.copyProperties(entity, updatedDto);

			return updatedDto;
		}
		log.info("entity not found for email" + email);
		return ProjectService.super.resetPassword(email);
	}

	@Override
	public ProjectDTO updatePassword(String userId, String password, String confirmPassword) {
		ProjectEntity entity = new ProjectEntity();
		if (password.equals(confirmPassword)) {
			boolean passwordUpdated = this.projectRepository.updatePassword(userId, passwordEncoder.encode(password),
					false, LocalTime.of(0, 0, 0));
			log.info("passwordUpdated--" + passwordUpdated);

		}
		return ProjectService.super.updatePassword(userId, password, confirmPassword);
	}

	@Override
	public boolean sendMail(String email, String text) {
		String portNumber = "587";// 485,587,25
		String hostName = "smtp.office365.com";
		String fromEmail = "sangeetha642@outlook.com";
		String password = "sangeetha@642";
		String to = email;

		Properties prop = new Properties();
		prop.put("mail.smtp.host", hostName);
		prop.put("mail.smtp.port", portNumber);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.debug", true);
		prop.put("mail.smtp.auth", true);
		prop.put("mail.transport.protocol", "smtp");

		Session session = Session.getInstance(prop, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}

		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(fromEmail));
			message.setSubject("Registration  Completed");
			// message.setText("Thanks for registration");
			message.setText(text);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			Transport.send(message);
			log.info("mail sent sucessfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return true;
	}

	public final static class DefaultPasswordGenerator {
		private static final String[] charCategories = new String[] { "abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789" };

		public static String generate(int length) {
			StringBuilder password = new StringBuilder(length);
			Random random = new Random(System.nanoTime());

			for (int i = 0; i < length; i++) {
				String charCategory = charCategories[random.nextInt(charCategories.length)];
				int position = random.nextInt(charCategory.length());
				password.append(charCategory.charAt(position));
			}

			return new String(password);
		}

	}

	@Override
	public ProjectDTO updateProfile(String userId, String email, Long mobile, String imagePath) {
		log.info("Inside update profile method");

		ProjectEntity upEntity = this.projectRepository.resetPassword(email);
		log.info("userId: " + userId + "email: " + email + "mobile: " + mobile + "image name: " + imagePath);

		upEntity.setUserId(userId);
		upEntity.setMobile(mobile);
		upEntity.setPicName(imagePath);
		boolean updated = this.projectRepository.update(upEntity);
		log.info("updated--" + updated);
		return ProjectService.super.updateProfile(userId, email, mobile, imagePath);
	}

	@Override
	public ProjectDTO addTechnology(String userId, TechnologyEntity technologyEntity) {

		log.info("Running addTechnology in service impl");

		ProjectEntity signUpEntity = this.projectRepository.userSignIn(userId);
		technologyEntity.setCreatedBy(userId);
		technologyEntity.setProjectEntity(signUpEntity);
		log.info("accessing entity" + signUpEntity);

		boolean saved = this.projectRepository.saveTechnology(technologyEntity);
		log.info("Technologies saved in database" + saved);

		return ProjectService.super.addTechnology(userId, technologyEntity);
	}

	@Override
	public List<TechnologyEntity> viewTechnology(String userId) {

		log.info("Running view Technology in service imple");
		ProjectEntity signUpEntity = this.projectRepository.userSignIn(userId);
		List<TechnologyEntity> technology = signUpEntity.getTechnology();
		log.info("Getting technologies as per userId : " + userId + " : " + technology);

		return technology;
	}

}
