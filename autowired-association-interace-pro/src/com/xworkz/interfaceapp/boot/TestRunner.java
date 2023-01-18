package com.xworkz.interfaceapp.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.interfaceapp.configuration.SpringConfiguration;
import com.xworkz.interfaceapp.interfaceapp.Browser;
import com.xworkz.interfaceapp.thing.Chrome;
import com.xworkz.interfaceapp.thing.FireFox;

public class TestRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Chrome chrome = spring.getBean(Chrome.class);
		chrome.browse();
		
		FireFox firefox = spring.getBean(FireFox.class);
		firefox.browse();
	}

}
