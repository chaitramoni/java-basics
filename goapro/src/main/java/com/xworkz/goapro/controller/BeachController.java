package com.xworkz.goapro.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goapro.DTO.BeachDTO;

@Component
@RequestMapping
public class BeachController {
	public BeachController() {
		System.out.println("Created : " + this.getClass().getSimpleName());
	}
	@PostMapping("/beach")
	public String onSend(BeachDTO dto, Model m) {
		System.out.println("Deatils are :" + dto);
		m.addAttribute("name",dto.getName());
		m.addAttribute("location",dto.getLocation());
		m.addAttribute("games", dto.getGames());
		return "disBeach.jsp";
	}
}