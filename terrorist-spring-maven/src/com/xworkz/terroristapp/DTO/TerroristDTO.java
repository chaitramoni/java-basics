package com.xworkz.terroristapp.DTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TerroristDTO extends AbstractAuditDTO {
	
	
	@NonNull
	@NotNull
	@Size( min = 3,max= 20, message = "Name is invalid")
	private String name;
	@NotNull
	@Min(value = 1, message = "Should be greater than 1 or less than 150")
	@Max(value = 150, message = "Should be greater than 1 or less than 150")
	private Integer age;
	@NonNull
	@NotNull
	@Size( min = 3,max= 50, message = "Name is invalid")
	private String country;
	@NonNull
	@NotNull
	@Size( min = 3,max= 80, message = "Name is invalid")
	private String specialist;
	@NonNull
	@NotNull
	@Size( min = 3,max= 30, message = "Name is invalid")
	private String organization;
	private boolean isAlive;
	private boolean prison;

}
