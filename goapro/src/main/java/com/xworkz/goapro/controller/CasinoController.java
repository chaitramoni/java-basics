package com.xworkz.goapro.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.goapro.DTO.CasinoDTO;
@Component
@RequestMapping("/enjoy")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	
	@PostMapping
	public String enjoyPost(CasinoDTO dto,Model m) {
		System.out.println("Details are :" +dto);
		m.addAttribute("name",dto.getName());
		m.addAttribute("cursie",dto.getCursie());
		m.addAttribute("entryFee",dto.getEntryFee());
		
		
		return "discasino.jsp";
	}

}
