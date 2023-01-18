package com.xworkz.interfaceapp.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.interfaceapp.interfaceapp.Browser;
import com.xworkz.interfaceapp.interfaceapp.Provider;
@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	@Override
	public void browse() {
		System.out.println("runner browse in chrome");
		provider.connect();
	}
	
	
	
	

}
