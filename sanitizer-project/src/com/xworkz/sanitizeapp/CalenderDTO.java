package com.xworkz.sanitizeapp;

public class CalenderDTO {
	
	private String name;
	private Integer year;
	private Integer cost;
	
	public CalenderDTO()
	{
		
	}
	
	public CalenderDTO(String name, Integer year, Integer cost) {
		super();
		this.name = name;
		this.year = year;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", year=" + year + ", cost=" + cost + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airpot");
		
		if(obj != null) {
			
			if(obj instanceof CalenderDTO) {
				CalenderDTO dto = (CalenderDTO)obj;
				if(dto.name.equals(this.name)) {
					return true;
				}
			}
			
		}
		return false;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	

	

	
	
	

}
