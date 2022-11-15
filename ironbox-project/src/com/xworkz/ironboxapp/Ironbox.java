package com.xworkz.ironboxapp;

public class Ironbox {
	
	public String ironboxId;
	public String ironboxName;
	public String ironboxType;
	
	//constructor default
	public Ironbox ()
	{
		
	}
	//parameterized constructor
	public Ironbox(String ironId,String ironnM,String irontType)
	{
		ironboxId = ironId;
		ironboxName = ironnM;
		ironboxType =irontType;
		
	}
	public void toIronClothes()
	{
		System.out.println("To iron clothes");
	}
		
	

}
