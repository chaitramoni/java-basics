package com.xworkz.interfaceapp.thing;

import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Provider;
@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("running connect in jio");
		
	}
	
	
	

}
