package com.xworkz.constructorautowiredapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	private String ghostName;
	private int ghostAge;
	private String ghostAddress;
	private double ghostNumber;
	private int ghostHouseNo;
	@Autowired
	@Qualifier("ghostDress")
	private String ghostDress;
	@Autowired
	@Qualifier("ghostLegs")
	private String ghostLegs;
	@Autowired
	@Qualifier("ghostNailLength")
	private int ghostNailLength;
	@Autowired
	@Qualifier("ghostColor")
	private String ghostColor;
	@Autowired
	@Qualifier("ghostHair")
	private String ghostHair;
	
	
	@Override
	public String toString() {
		return "Ghost [ghostName=" + ghostName + ", ghostAge=" + ghostAge + ", ghostAddress=" + ghostAddress
				+ ", ghostNumber=" + ghostNumber + ", ghostHouseNo=" + ghostHouseNo + ", ghostDress=" + ghostDress
				+ ", ghostLegs=" + ghostLegs + ", ghostNailLength=" + ghostNailLength + ", ghostColor=" + ghostColor
				+ ", ghostHair=" + ghostHair + "]";
	}


	public Ghost(String ghostName, int ghostAge, String ghostAddress, double ghostNumber, int ghostHouseNo) {
		super();
		this.ghostName = ghostName;
		this.ghostAge = ghostAge;
		this.ghostAddress = ghostAddress;
		this.ghostNumber = ghostNumber;
		this.ghostHouseNo = ghostHouseNo;
	}
	
	
	
	

}
