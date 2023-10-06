package com.xworkz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.entity.PersonalInfo;

public interface PersonalInfoRepo extends JpaRepository<PersonalInfo, Integer> {
	
	

}
