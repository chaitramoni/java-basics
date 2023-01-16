package com.xworkz.sanitizeapp;

import java.util.ArrayList;
import java.util.Collection;

public class CalenderDTORunner {
	
public static void main(String[] args) {
		
		CalenderDTO calenderDTO1 = new CalenderDTO("Hindu",2016,50);
		CalenderDTO calenderDTO2 = new CalenderDTO("Tamil",2018,60);
		CalenderDTO calenderDTO3 = new CalenderDTO("Telug9",2016,65);
		CalenderDTO calenderDTO4 = new CalenderDTO("Hindi",2020,50);
		CalenderDTO calenderDTO5 = new CalenderDTO("English",2011,85);
		
boolean equals = calenderDTO1.equals(calenderDTO3);
		
		System.out.println(calenderDTO1.getName().equals(calenderDTO3.getName()));
		
		Collection<CalenderDTO> calender = new ArrayList<CalenderDTO>();
		calender.add(calenderDTO1);
		calender.add(calenderDTO2);
		
		boolean contains = calender.contains(calenderDTO3);
		
	
	

}
}
