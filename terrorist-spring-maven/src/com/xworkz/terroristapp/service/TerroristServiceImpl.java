package com.xworkz.terroristapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terroristapp.DTO.TerroristDTO;

public class TerroristServiceImpl implements TerroristService{
	
	
	public TerroristServiceImpl()
	{
		System.out.println("created TerroristServiceImpl using no args");
	}



	
	@Override
	
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("dto passed :" + dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator valide =factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = valide.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("error is there");
			violations.forEach(c->System.out.println(c.getMessage()));
			return false;
		}
		System.out.println("no validations error");
		return true;
	}
}
		
//		ValidatorProvider provider = new ValidatorProvider();
//		Set<ConstraintViolation<TerrirostDTO>> violations = provider.factory(TerrioristDTO.class);
//		
//		violations.forEach(e->System.out.println(e));
//		
//		
//		return false;
//		
	//}
	
	


