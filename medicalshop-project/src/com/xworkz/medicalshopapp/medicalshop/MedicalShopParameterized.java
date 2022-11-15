package com.xworkz.medicalshopapp.medicalshop;

public class MedicalShopParameterized 
{
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicineNames[];
	public String cosmetics[];
	public int noOfSections;
	public String billingMethod[];
	
	public MedicalShopParameterized(String gstNo, String address, String name,  String staffNames[], long staffContactNo[], String medicineNames[], String cosmetics[], int noOfSections, String billingMethod[])
	
	{
	this.gstNo = gstNo;
	this.address = address;
	this.name = name;
	this.noOfSections = noOfSections;
	this.staffNames = staffNames;
	this.staffContactNo = staffContactNo;
	this.medicineNames = medicineNames;
	this.cosmetics = cosmetics;
	this.billingMethod = billingMethod;
	}
	
	public void displayInfo()
	{
		System.out.println("Medical shop name is" + name);
		System.out.println("=================");
		System.out.println("medical shop gstNo is" + gstNo);
		System.out.println("=================");
		System.out.println("medical shop address is" + address);
		System.out.println("=================");
		
		for(int i=0;i<staffNames.length;i++)
		{
		System.out.println(staffNames[i]);	
		}
		System.out.println("=================");
		
		for(int i=0;i<staffContactNo.length;i++)
		{
		System.out.println(staffContactNo[i]);
		}
		System.out.println("=================");
		
		for(int i=0;i<medicineNames.length;i++)
		{
			System.out.println(medicineNames[i]);
	
		}
		System.out.println("=================");
		
		for(int i= 0;i<cosmetics.length;i++)
		{
		System.out.println(cosmetics[i]);
		}
		System.out.println("=================");
		
		
		for(int i= 0;i<billingMethod.length;i++)
		{
		System.out.println(billingMethod[i]);
		}
		
	}
	
		
		
		
		
	}
	
	




