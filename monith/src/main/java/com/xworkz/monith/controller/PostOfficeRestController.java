package com.xworkz.monith.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.monith.DTO.ElectionDto;
import com.xworkz.monith.DTO.PostOfficeDto;

@RestController
@RequestMapping(value="/send",produces = MediaType.APPLICATION_JSON_VALUE)
public class PostOfficeRestController {
	
	public PostOfficeRestController () {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public PostOfficeDto onGetPost(PostOfficeDto dto) {
	System.out.println("Running onGet in PostOfficeRestController");
	PostOfficeDto dto1=new PostOfficeDto(1,"dasarahalipost","dasarahalli","bangalore");
	return dto1;
	}
	
	
	@PostMapping
	public String onPost() {
	System.out.println("Running onPost in PostOfficeRestController");
	return "Send msg";	
	}
	
	@GetMapping("/list")
	public List<PostOfficeDto> onList(PostOfficeDto dto){
	System.out.println("Running getList in PostOfficeRestController");	
	System.out.println("PostofficeDto" + dto);
	
	List<PostOfficeDto> list = new ArrayList<PostOfficeDto>();
	list.add(new PostOfficeDto(2,"hublipost","huballi","karnataka"));
	list.add(new PostOfficeDto(3,"mangalorePost","mangalore","karnataka"));
		
		return list;
		
		
	}

}
