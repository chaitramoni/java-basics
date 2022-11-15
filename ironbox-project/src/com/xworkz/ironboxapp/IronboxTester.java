package com.xworkz.ironboxapp;

public class IronboxTester {
	public static void main(String a[])
	{
	Ironbox iron = new Ironbox("ARE123","Philips","Hot");
	System.out.println("IronBox Details");
	System.out.println(iron.ironboxId + " "+ iron.ironboxName + " " + iron.ironboxType);
	
	Ironbox iron1 = new Ironbox("XD235","Nylon","Water");
	
	System.out.println("IronBox Details");
	System.out.println(iron1.ironboxId + " "+ iron1.ironboxName + " " + iron1.ironboxType);
	}
}
