package com.xworkz.monith.tester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moni")
public class Runner {
	
	public Runner() {
		
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	
	@GetMapping(produces ="application/json")
	public String onRunner() {
	System.out.println("Running on runnerclass");
	return "Welcome to Spring Boot class";
	
		
	}

}
