package com.xworkz.autowiredmaven.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	
	@Autowired
	@Qualifier("rubberName")
	private String rubberName;
	@Autowired
	@Qualifier("rubberType")
	private String rubberType;
	@Autowired
	private Double rubberPrice;
	@Autowired
	@Qualifier("rubberColor")
	private String rubberColor;
	@Autowired
	@Qualifier("rubberShape")
	private String rubberShape;
	@Autowired
	private boolean isRubberStolen;
	@Autowired
	@Qualifier("rubberSize")
	private String rubberSize;
	
	@Override
	public String toString() {
		return "Rubber [rubberName=" + rubberName + ", rubberType=" + rubberType + ", rubberPrice=" + rubberPrice
				+ ", rubberColor=" + rubberColor + ", rubberShape=" + rubberShape + ", isRubberStolen=" + isRubberStolen
				+ ", rubberSize=" + rubberSize + "]";
	}
	
	
	

}
