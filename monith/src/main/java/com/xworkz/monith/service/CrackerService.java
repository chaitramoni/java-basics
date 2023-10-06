package com.xworkz.monith.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xworkz.monith.DTO.CrackerDto;
import com.xworkz.monith.entity.CrackerEntity;

public interface CrackerService {
	
	boolean save(CrackerDto crackerDto);
	
	default CrackerDto getById(int id) {
		return null;
	}
	
	default CrackerEntity update(CrackerEntity crackerEntity) {
		return null;
	}
	
	void deleteById(int id);
	
	
	List<CrackerDto>findAll();
	
	Page<CrackerEntity> Pagination(Pageable pageable);
	
	

}
