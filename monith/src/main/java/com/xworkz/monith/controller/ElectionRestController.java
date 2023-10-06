package com.xworkz.monith.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.xworkz.monith.DTO.ElectionDto;

@RestController
@RequestMapping(value="/election",produces = MediaType.APPLICATION_JSON_VALUE)
public class ElectionRestController {
	
	public ElectionRestController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	
	
	@GetMapping
	public ElectionDto onGetElect(ElectionDto dto) {
	//System.out.println("Running onGet in ElectionRestController");
	ElectionDto dto1=new ElectionDto(1,"Bijapur","jds","shivalingeGowda");
	return dto1;
	}
	
	
	@PostMapping
	public String onPost() {
	//System.out.println("Running onPost in ElectionRestController");
	return "Vote for right one";	
	}
	
	@GetMapping("/list")
	public List<ElectionDto> onList(ElectionDto dto){
	//System.out.println("Running getList in ElectionRestController");	
	//System.out.println("ElectionDto" + dto);
	
	List<ElectionDto> list = new ArrayList<ElectionDto>();
	list.add(new ElectionDto(2,"hubli","congress","Ashoka"));
	list.add(new ElectionDto(3,"dasarahali","bjp","sushma"));
		
		return list;
		
		
	}

	
	
}
