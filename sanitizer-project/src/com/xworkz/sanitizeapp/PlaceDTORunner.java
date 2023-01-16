package com.xworkz.sanitizeapp;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceDTORunner {
	
public static void main(String[] args) {
		
		PlaceDTO placeDTO1 = new PlaceDTO("malleshwaram","18thcross");
		PlaceDTO placeDTO2 = new PlaceDTO("majestic","freedompark");
		PlaceDTO placeDTO3 = new PlaceDTO("nagasandra","8thmile");
		PlaceDTO placeDTO4 = new PlaceDTO("rajajinagar","boshamcircle");
		PlaceDTO placeDTO5 = new PlaceDTO("esihospital","rajajinagar");
		
		
boolean equals = placeDTO1.equals(placeDTO3);
		
		System.out.println(placeDTO1.getName().equals(placeDTO3.getName()));
		
		Collection<PlaceDTO> place = new ArrayList<PlaceDTO>();
		place.add(placeDTO1);
		place.add(placeDTO2);
		
		boolean contains = place.contains(placeDTO3);
		
	
}
}
