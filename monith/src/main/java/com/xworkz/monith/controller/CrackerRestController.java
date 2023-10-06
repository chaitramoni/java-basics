package com.xworkz.monith.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.monith.DTO.CrackerDto;
import com.xworkz.monith.entity.CrackerEntity;
import com.xworkz.monith.service.CrackerService;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping(value = "/cracker",produces = MediaType.APPLICATION_JSON_VALUE)
public class CrackerRestController {
	
	@Autowired
	private CrackerService crackerService;
	
	//private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CrackerRestController.class);
	
	public CrackerRestController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	
	@GetMapping
	public CrackerDto onGet() {
	//System.out.println("Running onGet in CrackerRestController");
	log.info("Logging service started");
	log.info("please check carefully");
	log.info("its for debugging purpose");
	CrackerDto crackerDto = new CrackerDto(1,"Rocket",45D,"Standard");
	log.info("crackerDto" + crackerDto);
	this.crackerService.save(crackerDto);
	return crackerDto;
	}
	
	
	@PostMapping("/post")
	public String onPost(@RequestBody CrackerDto dto) {
	System.out.println("Running onPost in crackerRestController");
	System.out.println("crackerDto" + dto);
	this.crackerService.save(dto);
	log.info("Running in post method");
	return "save success";
	}
	
	
	@GetMapping("/list")
	public List<CrackerDto> onList(CrackerDto dto){
	System.out.println("Running getList in CrackerRestController");	
	System.out.println("CrackerDto" + dto);
	
	List<CrackerDto> list = new ArrayList<CrackerDto>();
	list.add(new CrackerDto(2,"AtomBomb",30D,"Ashoka"));
	list.add(new CrackerDto(3,"Bomb",20D,"Standard"));
		
		return list;
	}
	
	
	@PutMapping(value ="/modify")
		public CrackerEntity onUpdate(@RequestBody CrackerEntity cracker) {
		return crackerService.update(cracker);
	}
	
	
	@DeleteMapping(path ="/delete")
	public void onDelete(@RequestParam(value = "id") int id){
		this.crackerService.deleteById(id);
	}
	
	
	@GetMapping("/findAll")
	public List<CrackerDto> findAll(){
		System.out.println("running on findAll");
		return this.crackerService.findAll();
	}
	
	@RequestMapping(value = "/page",method=RequestMethod.GET)
	Page<CrackerEntity> list(Pageable pageable){
		Page<CrackerEntity> page = crackerService.Pagination(pageable);
		return page;
		
	}
	
		

}
