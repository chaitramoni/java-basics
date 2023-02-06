package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fooditem.DTO.InterviewDTO;
@Component
@RequestMapping("/clear")
public class InterviewComponent {
	@PostMapping
	public String onClick(InterviewDTO dto)
    {
  	  System.out.println("The Deatils are : " +dto);
  	  return "display.jsp";
    }



}