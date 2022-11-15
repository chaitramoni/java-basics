package com.xworkz.inheritanceapp.base;

public class ProgrammingLanguage {
	public String name;
	public String durationPeriod;
	public String instituteName;
	
	public void forDeveloping(String name, String durationPeriod)
	{
		this.name = name;
		this.durationPeriod = durationPeriod;
		System.out.println(this.name);
		System.out.println(this.durationPeriod);
	}

}
