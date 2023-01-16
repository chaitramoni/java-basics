package com.xworkz.constructorautowiredapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String engineName;
	private String engineType;
	@Autowired
	private int engineNumber;
	@Autowired
	private double engineVersion;
	private String engineCompany;
	
	
	@Override
	public String toString() {
		return "Engine [engineName=" + engineName + ", engineType=" + engineType + ", engineNumber=" + engineNumber
				+ ", engineVersion=" + engineVersion + ", engineCompany=" + engineCompany + "]";
	}


	public Engine(String engineName, String engineType, String engineCompany) {
		
		this.engineName = engineName;
		this.engineType = engineType;
		this.engineCompany = engineCompany;
	}
	

}
