package com.xworks.overloadingapp;

import com.xworks.overloadingapp.overloading.PetrolBunk;

public class PetrolBunkTester {
	
	public static void main(String a[])
	{
		/*String workersName[] = {"Akash","Suma","Sneha","Priya","Sumanth","Raju","Ganesh"};
		PetrolBunk bunk = new PetrolBunk(123,"DeveGowda Petrol Bunk","Banashenkari",workersName);
		System.out.println(bunk.id + " " + bunk.name + " " + bunk.location);*/
		
		
		String workersName[] = {"Akhil","Suresh","Sneha","Praveen","Sukanya","Roopesh","Akash"};
		PetrolBunk bunk2 = new PetrolBunk(workersName);
		System.out.println(bunk2.id + " " + bunk2.name + " " + bunk2.location);
		
		bunk2.displayDetails();
		
		
	}

}
