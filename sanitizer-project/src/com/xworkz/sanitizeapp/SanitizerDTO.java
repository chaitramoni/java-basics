
package com.xworkz.sanitizeapp;

public class SanitizerDTO {
	
	
	private String color;
	private Double price;
	private Integer id;
	
	public SanitizerDTO()
	{
		
	}
	
	public SanitizerDTO(String color,Double price,Integer id)
	{
		this.color = color;
		this.price = price;
		this.id = id;
	}
	
	
	@Override
	public String toString()
	{
		return "Sanitizer - [color - " + this.getColor() + " , price - " + this.getPrice()+",id - "+ this.getId()+"]";
		
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

}
