package com.xworkz.project.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.entity.TechnologyEntity;
import com.xworkz.project.service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	private List<String> list = Arrays.asList("MS-Windows", "Ubantu", "Mac OS", "fedora", "Solaris", "Chrome Os",
			"Deepin");
	private List<String> openSource = Arrays.asList("Yes", "No");
	private List<String> language = Arrays.asList("PHP", "JavaScript", "CSS", "Bootstrap");

	public ProjectController() {
		log.info("created" + this.getClass().getSimpleName());
	}

	@PostMapping("/signUp")
	public String onSignUp(Model model, ProjectDTO dto) {
		if (dto.getPassword().equals(dto.getConfirmPassword())) {
			Set<ConstraintViolation<ProjectDTO>> violations = this.projectService.validateAndSave(dto);

//for checking uniqueness 	
			if (violations == null) {
				model.addAttribute("alreadyExist", "USerID or Email or Mobile already exists");
				return "signUp";
			}

			if (violations != null && violations.isEmpty()) {
				model.addAttribute("message", "data saved successfully");
				log.info("" + dto);
				return "signUp";
			} else {
				model.addAttribute("error", violations);
				model.addAttribute("dto", dto);
			}
			return "signUp";
		} else {
			model.addAttribute("password", "password and confirm password must be same");
			log.info("not matched password");
		}
		return "signUp";

	}

	@PostMapping("/signin")
	public String userSignIn(String userId, String password, Model model, HttpServletRequest request) {
		try {
			ProjectDTO dto = this.projectService.userSignIn(userId, password);
			log.info("lockcount" + dto.getLockcount());
			log.info("Dto----" + dto);

			if (dto.getLockcount() >= 3) {
				log.info("running in count");
				model.addAttribute("msg", "Account locked Reset Password");
				return "signIn";
			} else if (dto != null) {
				if (dto.getResetPassword() == true) {
					log.info("Running in ResetPassword true condition");
					if (!dto.getPasswordChangedTime().isAfter(LocalTime.now())) {
						log.info("Running in time warifying condition");
						model.addAttribute("msgs", "Time out plz try again after sometime");
						return "signIn";
					}
					model.addAttribute("userID", dto.getUserId());
					log.info("Running in reset condition");
					log.info("ResetPassword---" + dto.getResetPassword());
					log.info("Timer-----" + dto.getPasswordChangedTime().isAfter(LocalTime.now()));
					return "updatePassword";
				}
				log.info("User ID and password is matched");
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute("userID", dto.getUserId());
				httpSession.setAttribute("dtoPic", dto.getPicName());
				httpSession.setAttribute("dto", dto);
				return "loginSuccess";
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		log.info("UserID OR Password is not matching");
		model.addAttribute("message", "UserID OR Password is not matching");
		return "signIn";
	}

	@PostMapping("/reset")
	public String reSetPassword(String email, Model model) {
		try {
			log.info("Running reset password in controller " + email);
			ProjectDTO dto = this.projectService.resetPassword(email);
			if (dto.getResetPassword() == true) {
				model.addAttribute("msg", "Password reset sucessful plz login");
				return "resetpassword";
			}
		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return "resetpassword";
	}

	@PostMapping("/passwordUpdate")
	public String upDatePassword(String userId, String password, String confirmPassword) {
		this.projectService.updatePassword(userId, password, confirmPassword);
		return "success";
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("chitra") MultipartFile multipartFile, String userId, String email,
			Long mobile, Model model) throws IOException {
		log.info("multipartFile" + multipartFile);
		log.info(multipartFile.getOriginalFilename());

		String imageFormat = multipartFile.getOriginalFilename().substring(
				multipartFile.getOriginalFilename().lastIndexOf('.'), multipartFile.getOriginalFilename().length());

		log.info("Image Format " + imageFormat);
		log.info(multipartFile.getContentType());
		log.info("Size of file" + multipartFile.getSize());
		log.info("Size of bite" + multipartFile.getBytes());
		if (multipartFile.isEmpty()) {
			log.info("file not uploaded");
			model.addAttribute("error", "please select file");
			return "updateProfile";
		}
		model.addAttribute("sucess", "image uploaded sucessfully");
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("C:\\pic\\" + userId + System.currentTimeMillis() + imageFormat);
		Files.write(path, bytes);
		String imageName = path.getFileName().toString();
		log.info("Image name--" + imageName);
		log.info("Image name in tostring--" + path.toString());
		log.info("Image file name--" + path.getFileName());
		this.projectService.updateProfile(userId, email, mobile, imageName);
		return "updateProfile";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName, ProjectDTO user)
			throws IOException {
		try {
			Path path = Paths.get("C:\\pic\\" + user.getPicName());
			path.toFile();
			response.setContentType("image/jpeg");
			File file = new File("C:\\pic\\" + fileName);
			InputStream in = new BufferedInputStream(new FileInputStream(file));
			ServletOutputStream out = response.getOutputStream();
			IOUtils.copy(in, out);
			response.flushBuffer();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}

	}

	@GetMapping("/technology")
	public String addTech(Model model) {
		model.addAttribute("type", list);
		model.addAttribute("oss", openSource);
		model.addAttribute("lang", language);
		return "AddTechnology";
	}

	// add Technology
	@PostMapping("/technology")
	public String onTechnology(String userId, TechnologyEntity entity, Model model) {
		log.info("Running technology in controller");

		ProjectDTO dto = this.projectService.addTechnology(userId, entity);
		model.addAttribute("techs", "technologies added successfully");
		model.addAttribute("techno", entity);
		model.addAttribute("type", list);
		model.addAttribute("oss", openSource);
		model.addAttribute("lang", language);

		return "AddTechnology";
	}

	@GetMapping("/viewTech")
	public String onViewTech(@RequestParam String userId, Model model) {
		log.info("Running view technology in controller");
		List<TechnologyEntity> technology = this.projectService.viewTechnology(userId);
		model.addAttribute("viewTech", technology);
		return "ViewTechnology";
	}

}
