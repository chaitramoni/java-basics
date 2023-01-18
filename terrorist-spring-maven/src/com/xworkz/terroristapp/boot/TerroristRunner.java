package com.xworkz.terroristapp.boot;

import com.xworkz.terroristapp.DTO.TerroristDTO;
import com.xworkz.terroristapp.service.TerroristService;
import com.xworkz.terroristapp.service.TerroristServiceImpl;

public class TerroristRunner {
	
	public static void main(String[] args) {
		
		
		TerroristDTO terroristdto = new TerroristDTO();
		terroristdto.setName("Pavan");
		terroristdto.setAge(28);
		terroristdto.setCountry("Pakistan");
		terroristdto.setOrganization("Pak");
		terroristdto.setSpecialist("Firing");
		terroristdto.setPrison(true);
		terroristdto.setAlive(false);
		
		System.out.println(terroristdto);
		
		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(terroristdto);
		
		
		
	}

}
