package com.xworkz.teastallapp.teastall;

public class TeaStall {
	public String name;
	public int teaStallId;
	public String ownerName;
	
	//Default constructor
	public TeaStall()
	{
		
	}
	
	//Parameterized constructor
	public TeaStall(String name,int teaStallId,String ownerName)
	{
		
		this.name = name;
		this.teaStallId = teaStallId;//Id is optional
		this.ownerName = ownerName;
		
		//invoking displayInfo in constructor using this keyword
		this.displayInfo();
	}
	//invoking variable of current class using this keyword
	public void displayInfo()
	{
		System.out.println(this.name + " " +this.teaStallId + " " + this.ownerName);	
		
	}
	
	

}
