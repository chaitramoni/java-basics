package com.xworkz.sanitizeapp;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayDTORunner {
	
public static void main(String[] args) {
		
		HolidayDTO holidayDTO1 = new HolidayDTO("Festival",2);
		HolidayDTO holidayDTO2 = new HolidayDTO("sick",5);
		HolidayDTO holidayDTO3 = new HolidayDTO("marriage",10);
		HolidayDTO holidayDTO4= new HolidayDTO("family",3);
		HolidayDTO holidayDTO5 = new HolidayDTO("government",1);
		
boolean equals = holidayDTO1.equals(holidayDTO3);
		
		System.out.println(holidayDTO1.getReason().equals(holidayDTO3.getReason()));
		
		Collection<HolidayDTO> holiday = new ArrayList<HolidayDTO>();
		holiday.add(holidayDTO1);
		holiday.add(holidayDTO2);
		
		boolean contains = holiday.contains(holidayDTO3);
		
	
	


}
}
