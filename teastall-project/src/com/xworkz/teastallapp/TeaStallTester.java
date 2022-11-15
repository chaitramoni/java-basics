package com.xworkz.teastallapp;

import com.xworkz.teastallapp.teastall.TeaStall;

public class TeaStallTester {
	public static void main(String a[])
	{
		//Default constructor
		/*TeaStall ref = new TeaStall();
		System.out.println(ref.name + " " +ref.teaStallId + " " + ref.ownerName);
		ref.name = "Chaiwala";
		ref.teaStallId = 123;
		System.out.println(ref.name + " " + ref.teaStallId);*/
		
		//parameterized Constructor
		TeaStall ref1 = new TeaStall("Chaiwala",123,"Akash");
		//System.out.println(ref1.name + " " +ref1.teaStallId + " " + ref1.ownerName);
	}

}
 