package com.xworkz.plane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bekary.plane")
public class PlaneEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	
	@Column(name = "p_company")
	private String company;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name = "p_cost")
	private Integer cost;
	
	@Column(name = "p_type")
	private String type;
	
	@Column(name = "p_country")
	private String country;
	

}
