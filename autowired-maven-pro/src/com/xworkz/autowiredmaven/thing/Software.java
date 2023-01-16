package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("softwareName")
	private String softwareName;
	@Autowired
	private double softwareVersion;
	@Autowired
	@Qualifier("softwareDeveloper")
	private String softwareDeveloper;
	@Autowired
	@Qualifier("softwareDate")
	private String softwareDate;
	@Autowired
	private boolean isFree;
	
	@Override
	public String toString() {
		return "Software [softwareName=" + softwareName + ", softwareVersion=" + softwareVersion
				+ ", softwareDeveloper=" + softwareDeveloper + ", softwareDate=" + softwareDate + ", isFree=" + isFree
				+ "]";
	}
	
	
	
	
	

}
