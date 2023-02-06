package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/kharaf")
public class FoodItemComponent {
	
	public FoodItemComponent() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	
	@PostMapping
	public String tastePost(@RequestParam String name,@RequestParam String type,@RequestParam String quantity,@RequestParam double price) {
		System.out.println("running tastePost :");
		System.out.println(name);
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(price);
		
		return "display.jsp";
	}

}
