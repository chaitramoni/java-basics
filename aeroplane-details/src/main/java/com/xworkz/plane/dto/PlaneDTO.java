package com.xworkz.plane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlaneDTO {
	@Size(min =3,max = 20,message= "Company cannot be less than 3 or greater than 20")
	private String company;
	
	@Size(min =3,max = 20,message= "Name cannot be less than 3 or greater than 20")
	private String name;
	
	private Integer cost;
	
	@NotBlank(message = "Type should be selected")
	private String type;
	
	@NotBlank(message = "Country should be selected")
	private String country;
	

}
