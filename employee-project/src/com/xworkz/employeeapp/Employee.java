package com.xworkz.employeeapp;

public class Employee {
	
	public static String companyName;
	public static String companyAddress;
	
	public String employeeId;
	public String employeeName;
	public String bloodGroup;
	
	public Employee()
	{
		
	}
	
	public Employee(String empId,String nm,String bGroup)
	{
		System.out.println("EmployeeObject is Created");
		this.employeeId = empId;
		this.employeeName = nm;
		this.bloodGroup = bGroup;
	}
	
	public void toHelpOrgToGrow()
	{
		System.out.println("namde company");
	}
	

		
			

}
