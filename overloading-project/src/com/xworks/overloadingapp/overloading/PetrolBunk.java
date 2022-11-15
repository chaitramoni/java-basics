package com.xworks.overloadingapp.overloading;

public class PetrolBunk {				//Constructor overloading
	

	public int id;
	public String name;
	public String location;
	public String workersName[] = new String[7];
	
	public PetrolBunk()
	{
		System.out.println("Default constructor is called");	
	}
		
	
	public PetrolBunk(String workersName[])
	{
		this(123,"DeveGowda Petrol Bunk","Banashenkari",workersName);
		System.out.println("Petrol bunk object is created");
	}
	
	
	public PetrolBunk(int id,String name,String location,String[] workersName)
	{
		this();//constructor chaining this();method is used
		System.out.println("calling parameterized constructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.workersName = workersName;
	}
	
	public void displayDetails()
	{
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " " + this.name + " " + this.location);
		System.out.println("list of workers for" + this.name);
		for(int i = 0;i < workersName.length;i++)
		{
		System.out.println(workersName[i]);	
			
		}
		}
		
	}
	

	
