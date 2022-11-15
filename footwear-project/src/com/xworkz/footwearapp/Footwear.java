
package com.xworkz.footwearapp;

public class Footwear {
	public String footwearId;
	public String footwearSize;
	public String footwearColor;
	public String brandName;
	public String footwearModel;
	//constructor
	public Footwear()
	{
		
	}
	//parameterized constructor
	public Footwear(String fId,String fSize,String fColor,String fbName,String fModel)
	{
	footwearId = fId;
	footwearSize = fSize;
	footwearColor = fColor;
	brandName =  fbName;
	footwearModel = fModel;
	}
		
	
	public void toWear()
	{
		System.out.println("To Have a Safe walk");
	}
	
}
	
	


