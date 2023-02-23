package com.xworkz.plane.service;



import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.plane.dto.PlaneDTO;
import com.xworkz.plane.entity.PlaneEntity;
import com.xworkz.plane.repository.PlaneRepository;

@Service
public class PlaneServiceImpl implements PlaneService {

	@Autowired
	private PlaneRepository planeRepository;
	
	public PlaneServiceImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	
	

	@Override
	public Set<ConstraintViolation<PlaneDTO>> validateAndSave(PlaneDTO dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<PlaneDTO>> violations = validator.validate(dto);
		
		if(violations !=null&& !violations.isEmpty()) {
			System.err.println("violation is dto" +dto);
			return violations;
		}else {
			System.out.println("violation is not there in dto ,can save");
			
			
			if(violations !=null && !violations.isEmpty()) {
				
				System.err.println("violation in dto" + dto);
				return violations;
			}else {
				System.out.println("violation is not there in dto,can save");
				PlaneEntity entity = new PlaneEntity();
				entity.setCompany(dto.getCompany());
				entity.setName(dto.getName());
				entity.setCost(dto.getCost());
				entity.setType(dto.getType());
				entity.setCountry(dto.getCountry());
				
				boolean saved = this.planeRepository.save(entity);
				System.out.println("Entity data is saved" + saved);
				
				return Collections.emptySet();
			}
		}
		
	}
			
			@Override
			public PlaneDTO findById(int id) {
				
				if(id > 0) {
					
					PlaneEntity entity = this.planeRepository.findById(id);
					
					if(entity  != null) {
						
						System.out.println("entity is found in service in id" + id);
						PlaneDTO dto1 = new PlaneDTO();
						dto1.setCompany(entity.getCompany());
						dto1.setName(entity.getName());
						dto1.setCost(entity.getCost());
						dto1.setType(entity.getType());
						dto1.setCountry(entity.getCountry());
						
						return dto1;
						
						
					}
				}
				
				return PlaneService.super.findById(id);
			}
				
			
	
		
		
	}

