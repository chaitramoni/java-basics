package com.xworkz.project.dto;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectDTO {

	private Integer id;

	@Size(min = 3, max = 20, message = "userId cannot be less than 3 or greater than 20")
	private String userId;

	@Size(min = 3, max = 45, message = "email cannot be less than 3 or greater than 45")
	private String email;

	@Size(min = 3, max = 20, message = "password cannot be less than 3 or greater than 20")
	@NotBlank
	private String password;

	@NotBlank
	@NotNull
	private String confirmPassword;
	@NotNull
	private Long mobile;

	@NotBlank
	private String acceptAggreement;

	
	public int lockcount;
	
	
	private Boolean resetPassword;
	
	private LocalTime passwordChangedTime;
	
	private String picName;


	
		
		
		
	

}
