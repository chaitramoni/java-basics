package com.xworkz.redbusapp.vrl;

import com.xworkz.redbusapp.redbus.RedBusContract;

public class Vrllmpl implements RedBusContract{

	
	@Override
	public int minBookings() {
		
		return 23;
	}
	
	
	@Override
	public boolean conditionOfBus() {
		return false;
		
		
	}

	
	
	

}
