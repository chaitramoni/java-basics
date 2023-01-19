package com.xworkz.soldierapp.boot;

import com.xworkz.soldierapp.DTO.SoldierDTO;
import com.xworkz.soldierapp.repository.SoldierRepo;
import com.xworkz.soldierapp.repository.SoldierRepoImpl;
import com.xworkz.soldierapp.service.SoldierService;
import com.xworkz.soldierapp.service.SoldierServiceImpl;

public class SoldierRunner {
	
	public static void main(String[] args) {
		
		SoldierDTO soldierdto = new SoldierDTO("monith",1,"topper","Indian army","india");
		System.out.println(soldierdto);
		
	
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(soldierdto);
		
	}

}
