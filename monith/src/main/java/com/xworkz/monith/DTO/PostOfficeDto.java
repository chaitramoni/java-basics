package com.xworkz.monith.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostOfficeDto {
	private int id;
	private String name;
	private String location;
	private String district;

}
