package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	private int hardwareId;
	@Autowired
	@Qualifier("hardwareName")
	private String hardwareName;
	@Autowired
	private double gstNo;
	@Autowired
	@Qualifier("hardwareOwnerName")
	private String hardwareOwnerName;
	@Autowired
	@Qualifier("hardwareAddress")
	private String hardwareAddress;

	
	@Override
	public String toString() {
		return "HardwareShop [id = " + hardwareId +",  name=" + hardwareName + ", gstNo=" + gstNo + ", ownerName=" + hardwareOwnerName + ", address="
				+ hardwareAddress + "]";
	}
	
	
	
	

}
