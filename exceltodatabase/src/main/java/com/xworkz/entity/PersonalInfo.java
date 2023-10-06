package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Table(name = "myInfo")
public class PersonalInfo {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "number")
	private long number;
	
	
	

}
