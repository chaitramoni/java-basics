package com.xworkz.employeeapp;

public class EmployeeTester {
	
	public static void main (String a[])
	{
		
		Employee.companyName = "Amazon";
		Employee.companyAddress = "Sarjapur";
		
		Employee emp = new Employee("AWS123","Akash","B+");
		
		System.out.println("Employee Details");
		System.out.println(emp.employeeId +" " + emp.employeeName + " " + emp.bloodGroup);
		System.out.println(Employee.companyName);
		System.out.println(Employee.companyAddress);
		
	}

}
