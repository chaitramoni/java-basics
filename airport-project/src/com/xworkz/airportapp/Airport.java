package com.xworkz.airportapp;

public class Airport {

	
		static String airportsNames[] = {null,null,null};
		static int index;
		
		public static boolean addAirportsNames(String airportsName)
	{
			
	
		airportsNames[index] = airportsName;
		    index++;
		
		
		return false;
	    }

		public static void getAirportsNames()
		{
		for(int index = 0;index < airportsNames.length;index++)
		{
		String ref = airportsNames[index];
		System.out.println("Airports Name is" + ref);
		}
		
		}
		
		

	}

