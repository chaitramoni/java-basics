package com.xworkz.medicalshopapp.medicalshop;

public class MedicalShop { 
	
	public String gstNo;
	public String address;
	public String name;
	public String staffNames[];
	public long staffContactNo[];
	public String medicineNames[];
	public String cosmetics[];
	public int noOfSections;
	public String billingMethod[];
	
	//public MedicalShop(String gstNo,)
	//this.gstNo = gstNo;
	
	public MedicalShop()
	{
		System.out.println("Medical Shop Object is Created");
	}
	
	public void displayInfo()
	{
		System.out.println("Medical shop name is" + name);
		System.out.println("=================");
		System.out.println("medical shop gstNo is" + gstNo);
		System.out.println("=================");
		System.out.println("medical shop address is" + address);
		System.out.println("=================");
		System.out.println("medical shop staffNames is" + staffNames);
		for(int i=0;i<staffNames.length;i++)
		{
		System.out.println(staffNames[i]);	
		}
		System.out.println("=================");
		System.out.println("medical shop staffContactNo is" + staffContactNo);
		for(int i=0;i<staffContactNo.length;i++)
		{
		System.out.println(staffContactNo[i]);
		}
		System.out.println("=================");
		System.out.println("medical shop medicineNames is" + medicineNames);
		for(int i=0;i<medicineNames.length;i++)
		{
			System.out.println(medicineNames[i]);
	
		}
		System.out.println("=================");
		System.out.println("medical shop cosmetics is" + cosmetics);
		for(int i= 0;i<cosmetics.length;i++)
		{
		System.out.println(cosmetics[i]);
		}
		System.out.println("=================");
		
		System.out.println("medical shop billingMethod is" + billingMethod);
		for(int i= 0;i<billingMethod.length;i++)
		{
		System.out.println(billingMethod[i]);
		}
		
	}
	
		
		
		
		
	}
	
	

