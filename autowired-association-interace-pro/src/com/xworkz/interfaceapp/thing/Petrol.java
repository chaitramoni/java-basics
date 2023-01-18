package com.xworkz.interfaceapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Fuel;
@Component
public class Petrol implements Fuel {
	
	@Override
	public void toConsume() {
		System.out.println("purchase fuel");
	}

}
