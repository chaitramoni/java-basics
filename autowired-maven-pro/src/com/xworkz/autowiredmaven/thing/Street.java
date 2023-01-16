package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Street {
	
	@Autowired
	private String name;
	@Autowired
	private Integer streetNo;
	@Autowired
	private double streetId;
	@Autowired
	private char startingWith;
	@Autowired
	private long pincode;
	@Autowired
	private short noOfShops;
	@Autowired
	private float noOfMembers;
	@Autowired
	private boolean isAvailable;
	@Autowired
	private byte houseNo;
	@Override
	
	
	public String toString() {
		return "Street [name=" + name + ", streetNo=" + streetNo + ", streetId=" + streetId + ", startingWith="
				+ startingWith + ", pincode=" + pincode + ", noOfShops=" + noOfShops + ", noOfMembers=" + noOfMembers
				+ ", isAvailable=" + isAvailable + ", houseNo=" + houseNo + "]";
	}
	

}
