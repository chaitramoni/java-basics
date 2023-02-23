package com.xworkz.plane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.plane.dto.PlaneDTO;


public interface PlaneService {
	
	Set<ConstraintViolation<PlaneDTO>> validateAndSave(PlaneDTO dto);
	default PlaneDTO findById(int id) {
		return null;
	}

}
