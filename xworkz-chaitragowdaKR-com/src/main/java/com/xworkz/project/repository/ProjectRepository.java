package com.xworkz.project.repository;

import java.time.LocalTime;
import java.util.List;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.project.entity.TechnologyEntity;

public interface ProjectRepository {
	
	boolean save(ProjectEntity entity);
	
	//uniqness
	default Long findCountByEmailAndUserIdAndMobile(String email,String userId,long mobile) {
		return null;
	}
	
	default Long findByEmail(String email) {
		return null;
	}

	default Long findByUser(String user) {
		
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}
	
	default ProjectEntity userSignIn(String userId) {
		return null;
	}
	
	 boolean onlock(String userId,int count);
	 
	 
	 
	 //reset Password
	default ProjectEntity resetPassword(String email) {
	return null;
		}
	 
	boolean update(ProjectEntity projectEntity);
		

	boolean updatePassword(String userId, String password, Boolean resetPassword, LocalTime passwordChangedTime);	
		
	boolean saveTechnology(TechnologyEntity entity);
	
	default List<TechnologyEntity>viewTechnology(String view){
		return null;
	}
	

	



	
	
	
}
