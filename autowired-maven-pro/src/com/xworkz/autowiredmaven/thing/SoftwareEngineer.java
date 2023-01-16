package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("softwareEngineerName")
	private String softwareEngineerName;
	@Autowired
	private double softwareEngineerSalary;
	@Autowired
	@Qualifier("softwareEngineerCompanyName")
	private String softwareEngineerCompanyName;
	@Autowired
	private int softwareEngineerNoOfExperience;
	
	
	@Override
	public String toString() {
		return "SoftwareEngineer [softwareEngineerName=" + softwareEngineerName + ", softwareEngineerSalary="
				+ softwareEngineerSalary + ", softwareEngineerCompanyName=" + softwareEngineerCompanyName
				+ ", SoftwareEngineerNoOfExperience=" + softwareEngineerNoOfExperience + "]";
	}
	
	
	
	
	
	

}
