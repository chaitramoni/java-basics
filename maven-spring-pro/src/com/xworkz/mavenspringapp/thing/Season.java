package com.xworkz.mavenspringapp.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private Integer duration;
	private String startingMonth;
	
	@Value("Summer")
	public  void setName(String name) {
		this.name = name;
	}
	@Value("october")
	public  void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	@Value("4")
	public  void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
	
	public Integer getDuration() {
		return duration;
	}

}
