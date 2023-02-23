package com.xworkz.plane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.plane.dto.PlaneDTO;
import com.xworkz.plane.service.PlaneService;


@Controller
@RequestMapping("/")
public class PlaneController {
	
	
	@Autowired
	private PlaneService planeService;
	
	
	
	
	List<String> type = Arrays.asList("helicoftor","jet","rocket","airforcejet");
	
	 List<String> country = Arrays.asList("usa","india","japan","china");
	
	 
	public PlaneController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	
	@GetMapping ("/plane")
	public String onPlane(Model model) {
		
		System.out.println("running on Plane get method");
		
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		
		
		return "plane";
		
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("running on search for id" +id);
		
		PlaneDTO dto = this.planeService.findById(id);
		
		if(dto!=null) {
			
			model.addAttribute("dto",dto);
		}
		else {
			
			model.addAttribute("message","Data not found");
		}
		return "planeSearch";
	}
	
	
	
	@PostMapping("/plane")
	public String onPlane(Model model,PlaneDTO dto) {
		System.out.println("running on plane Post method" + dto);
		
		Set<ConstraintViolation<PlaneDTO>> violations = planeService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			return "planeSuccess";
		}
		
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		model.addAttribute("error", violations);
		
		model.addAttribute("dto",dto);
		
		System.out.println(dto);
		System.out.println("violation in controller");
		return "plane";
	}
	
	
	

}
