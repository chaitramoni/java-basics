package com.xworkz.sanitizeapp;

public class AirpotDTO {
	
	
	private String name;
	private String address;
	private Integer noOfpassengers;
	
	public AirpotDTO()
	{
		
	}
	
	public AirpotDTO(String name,String address ,Integer noOfpassengers)
	{
		this.name = name;
		this.address = address;
		this.noOfpassengers = noOfpassengers;
	}
	
	@Override
	public String toString() {
		return "AirpotDTO [name=" + name + ", address=" + address + ", noOfpassengers=" + noOfpassengers + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airpot");
		
		if(obj != null) {
			
			if(obj instanceof AirpotDTO) {
				AirpotDTO dto = (AirpotDTO)obj;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getNoOfPassengers() {
		return noOfpassengers;
	}
	public void setNoOfPassengers(Integer noOfpassengers) {
		this.noOfpassengers = noOfpassengers;
	}
	

}



