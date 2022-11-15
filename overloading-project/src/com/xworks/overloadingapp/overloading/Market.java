package com.xworks.overloadingapp.overloading;

public class Market {
	public int id;
	public String name;
	public String location;
	public String sellerName[] = new String[3];
	
	public Market()
	{
		System.out.println("Default constructor is called");
	} 
	
	public Market(String sellerName[])
	{
		this(345,"KR Market","Majestic",sellerName);
		System.out.println("Market object is created");
	}
	
	public Market(int id,String name,String location,String[] sellerName)
	{
		this();
		System.out.println("calling parameterized constructor");
		this.id = id;
		this.name = name;
		this.location = location;
		this.sellerName = sellerName;
	}
	
	public void displayDetails()
	{
		System.out.println("displayDetails() is invoked");
		System.out.println(this.id + " " + this.name + " " + this.location);
		System.out.println("list of sellers for" + this.name);
		for(int i = 0;i < sellerName.length;i++)
		{
		System.out.println(sellerName[i]);	
		
	}

	}
}
