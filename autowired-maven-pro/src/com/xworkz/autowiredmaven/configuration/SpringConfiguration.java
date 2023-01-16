package com.xworkz.autowiredmaven.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowiredmaven")
public class SpringConfiguration {
	
	@Bean
	public int hardwareId() {
		System.out.println("registering id...");
		return 1234;
	}
	
	@Bean
	public String hardwareName() {
		System.out.println("registering name");
		return "lakshmivenkateshwara hardwarshop";
	}
	
	@Bean
	public double gstNo() {
		System.out.println("registering gstNo");
		return 3986.9;
	}
	
	@Bean
	public String hardwareOwnerName() {
		System.out.println("registring ownerName");
		return "chaitra";
	}
	
	@Bean
	public String hardwareAddress() {
		System.out.println("registering address");
		return "nagasandra";
	}
	
	
	
	//pencil
	
	@Bean
	public String pencilName() {
		System.out.println("registering  pencil name");
		return "doms"; 
		
	}
	
	@Bean
	public String pencilType() {
		System.out.println("registering type");
		return "drawing"; 
		
	}
	
	@Bean
	public String pencilColor() {
		System.out.println("registering color");
		return "black"; 
		
	}
	
	@Bean
	public double pencilPrice() {
		System.out.println("registering price");
		return 10.5; 
		
	}
	
	@Bean
	public boolean isPencilStolen() {
		System.out.println("registering boolean");
		return true; 
		
	}
	
	
	
	
	
	
	
	//rubber
	
	
	@Bean
	public String rubberName() {
		System.out.println("registering  rubber name");
		return "nataraja"; 
		
	}
	
	@Bean
	public String rubberType() {
		System.out.println("registering type");
		return "ink eraser"; 
		
	}
	
	@Bean
	public String rubberColor() {
		System.out.println("registering color");
		return "white"; 
		
	}
	
	@Bean
	public String rubberShape() {
		System.out.println("registering shape");
		return "rectangle"; 
		
	}
	
	@Bean
	public double rubberPrice() {
		System.out.println("registering price");
		return 5.5; 
		
	}
	
	@Bean
	public boolean isRubberStolen() {
		System.out.println("registering boolean");
		return true; 
		
	}
	@Bean
	public String rubberSize() {
		System.out.println("registering size");
		return "small"; 
		
	}
	
	
	
	
	
	//street
	
	
	@Bean
	public String name() {
		System.out.println("registering name");
		return "nagasandra"; 
		
	}
	
	@Bean
	public Integer streetNo() {
		System.out.println("registering number");
		return 12; 
		
	}
	
	@Bean
	public double streetId() {
		System.out.println("registering id");
		return 18.9; 
		
	}
	
	@Bean
	public char startingWith() {
		System.out.println("registering char");
		return 'n'; 
		
	}
	
	@Bean
	public long pincode() {
		System.out.println("registering pincode");
		return 560075L; 
		
	}
	
	@Bean
	public short noOfShops() {
		System.out.println("registering shops");
		return 10; 
		
	}
	
	@Bean
	public float noOfMembers() {
		System.out.println("registering members");
		return 3534445F; 
		
	}
	
	@Bean
	public byte housrNo() {
		System.out.println("registering house no");
		return 12; 
		
	}
	
	@Bean
	public boolean isAvailable() {
		System.out.println("registering boolean");
		return true; 
		
	}
	
	
	
	
	
	
	//SoftwareEngineer
	
	@Bean
	public String softwareEngineerName() {
		System.out.println("registering softwareEngineerName ");
		return "Chaitra";
	}
	
	@Bean
	public double softwareEngineerSalary() {
		System.out.println("registering softwareEngineerSalary ");
		return 68000.58;
	}
	
	@Bean
	public String softwareEngineerCompanyName() {
		System.out.println("registering softwareEngineerCompanyName ");
		return "TCS";
	}
	
	@Bean
	public int softwareEngineerNoOfExperience() {
		System.out.println("registering softwareEngineerNoOfExperience ");
		return 7;
	}
	
	
	
	
	
	//software
	
	@Bean
	public String softwareName() {
		System.out.println("registering softwareName ");
		return "MS Office";
	}
	
	@Bean
	public double softwareVersion() {
		System.out.println("registering softwareName ");
		return 12.5;
	}
	
	@Bean
	public String softwareDeveloper() {
		System.out.println("registering softwareDeveloper ");
		return "Monith";
	}
	
	@Bean
	public String softwareDate() {
		System.out.println("registering softwareDate ");
		return "10th Nov 2020";
	}
	
	@Bean
	public boolean isFree() {
		System.out.println("registering isFree ");
		return true;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
