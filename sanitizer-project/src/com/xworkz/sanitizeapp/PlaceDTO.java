package com.xworkz.sanitizeapp;

public class PlaceDTO {
	
	private String name;
	private String address;
	
	public PlaceDTO()
	{
		
	}

	public PlaceDTO(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", address=" + address + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airpot");
		
		if(obj != null) {
			
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto = (PlaceDTO)obj;
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
	
	

}
