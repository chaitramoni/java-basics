package com.xworkz.sanitizeapp;

import java.util.ArrayList;
import java.util.Collection;

public class AirpotDTORunner {
	
	public static void main(String[] args) {
		
		AirpotDTO airpotDTO1 = new AirpotDTO("HAL","Bangalore",50);
		AirpotDTO airpotDTO2 = new AirpotDTO("belagavi","Belagavi",70);
		AirpotDTO airpotDTO3 = new AirpotDTO("mangalore","Mangalore",55);
		AirpotDTO airpotDTO4 = new AirpotDTO("huballi","Huballi",60);
		
		boolean equals = airpotDTO1.equals(airpotDTO3);
		
		System.out.println(airpotDTO1.getName().equals(airpotDTO3.getName()));
		
		Collection<AirpotDTO> airpot = new ArrayList<AirpotDTO>();
		airpot.add(airpotDTO1);
		airpot.add(airpotDTO2);
		
		boolean contains = airpot.contains(airpotDTO3);
	}

}
