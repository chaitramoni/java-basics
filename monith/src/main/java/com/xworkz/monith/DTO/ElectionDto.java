package com.xworkz.monith.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ElectionDto {
	
	
	private int id;
	private String constituency;
	private String partyName;
	private String candidateName;
	
	

}
