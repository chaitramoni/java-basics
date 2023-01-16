package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String pencilName;
	@Autowired
	@Qualifier("pencilType")
	private String pencilType;
	@Autowired
	private Double pencilPrice;
	@Autowired
	@Qualifier("pencilColor")
	private String pencilColor;
	@Autowired
	private boolean isPencilStolen;
	
	
	@Override
	public String toString() {
		return "Pencil [pencilName=" + pencilName + ", pencilType=" + pencilType + ", pencilPrice=" + pencilPrice
				+ ", pencilColor=" + pencilColor + ", isPencilStolen=" + isPencilStolen
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
