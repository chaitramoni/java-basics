package com.xworkz.soldierapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldierapp.DTO.SoldierDTO;
import com.xworkz.soldierapp.repository.SoldierRepo;

public class SoldierServiceImpl implements SoldierService {
	
	private SoldierRepo soldierRepo;
	
	public SoldierRepo getSoldierRepo() {
		return soldierRepo;
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}
	
	
	public SoldierServiceImpl() {
		System.out.println("calling no-args constructor");
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("Running validateAndSave method");
		System.out.println("DTO" + dto);
		
		//factory
		//validator
		//validate
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.out.println("There are Validator errors");
			
			violations.forEach(ele->{System.out.println("violating message" + ele.getMessage());
			});
			return false;
			
			}
		else {
			System.out.println("data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("dto is saved using repo" + saved);
			return saved;
		}
		
		
		
	}

}
