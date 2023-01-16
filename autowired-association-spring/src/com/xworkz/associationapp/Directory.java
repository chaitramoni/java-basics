package com.xworkz.associationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Directory {
	@Autowired
	private Skill skill;
	@Autowired
	private Experience experience;
	
	
	public Directory() {
		System.out.println("Directory object is created");
	}
	
	public void toVerify() {
		System.out.println(this.experience.hashCode());
	}

}
