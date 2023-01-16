package com.xworkz.associationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill;
	public Experience() {
		System.out.println("Experience objecte created");
	}
	
	public void toVerifySkill() {
		System.out.println(this.skill.hashCode());
	}

}
