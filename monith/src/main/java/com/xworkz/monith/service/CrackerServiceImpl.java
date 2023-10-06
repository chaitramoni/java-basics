package com.xworkz.monith.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.xworkz.monith.DTO.CrackerDto;
import com.xworkz.monith.entity.CrackerEntity;
import com.xworkz.monith.repository.CrackerRepository;

@Service
public class CrackerServiceImpl implements CrackerService {
	
	@Autowired
	private CrackerRepository crackerRepo;

	@Override
	public boolean save(CrackerDto crackerDto) {
		System.out.println("running save method in serviceimpl....");
		CrackerEntity entity = new CrackerEntity();
		BeanUtils.copyProperties(crackerDto, entity);
		this.crackerRepo.save(entity);
		System.out.println("Entity saved" + entity);
		return true;
	}
	
	
	
	@Override
	public CrackerEntity update(CrackerEntity crackerEntity) {
		System.out.println("Running update in service");
		int id = crackerEntity.getId();
		CrackerEntity dto = crackerRepo.findById(id).get();
		dto.setName(crackerEntity.getName());
		dto.setPrice(crackerEntity.getPrice());
		dto.setBrand(crackerEntity.getBrand());
		return crackerRepo.save(dto);
		
	}



	@Override
	public void deleteById(int id) {
		System.out.println("Running deleteById");
		this.crackerRepo.deleteById(id);
		
	}
	
	
	@Override
	public List<CrackerDto>findAll(){
		System.out.println("Running findall");
		List<CrackerEntity> list = (List<CrackerEntity> )this.crackerRepo.findAll();
		return list.stream().map(t-> new CrackerDto(t.getId(), t.getName(),t.getPrice(),t.getBrand()))
				.collect(Collectors.toList());
		
	}
	
	@Override
	public Page<CrackerEntity> Pagination(Pageable pageable) {
		return crackerRepo.findAll(pageable);
	}

}
