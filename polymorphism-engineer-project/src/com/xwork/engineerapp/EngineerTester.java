package com.xwork.engineerapp;

//import com.xwork.engineerapp.engineer.CsEngineer;
import com.xwork.engineerapp.engineer.Engineer;

public class EngineerTester {
	public static void main(String[] args)
	{
		//Object object = new EcEngineer();
		//Object object2 = new CsEngineer();
		
		
		Engineer ecEngineer = new EcEngineer();
		String message = (String)ecEngineer.solveProblems();
		System.out.println(message);
		
		
		
		
		//Engineer csEngineer = new CsEngineer();//polymorphism
		
		
	}

}
