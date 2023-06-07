package com.xworkz.project.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.project.dto.ProjectDTO;
import com.xworkz.project.entity.TechnologyEntity;

public interface ProjectService {

	Set<ConstraintViolation<ProjectDTO>> validateAndSave(ProjectDTO dto);

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

	default Long findByMobile(Long number) {
		return null;
	}

	boolean sendMail(String email);

	default ProjectDTO userSignIn(String userId, String password) {
		return null;
	}

	default ProjectDTO resetPassword(String email) {
		return null;
	}

	default ProjectDTO updatePassword(String userId, String password, String confirmPassword) {
		return null;
	}

	boolean sendMail(String email, String text);

	default ProjectDTO updateProfile(String userId, String email, Long mobile, String imagePath) {
		return null;
	}

	default ProjectDTO addTechnology(String userId, TechnologyEntity entity) {
		return null;
	}

	default List<TechnologyEntity> viewTechnology(String userId) {
		return null;
	}

}
