package com.xworkz.sanitizeapp;

public class HolidayDTO {
	
	private String reason;
	private Integer noOfDays;
	
	public HolidayDTO()
	{
		
	}

	public HolidayDTO(String reason, Integer noOfDays) {
		super();
		this.reason = reason;
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "HolidayDTO [reason=" + reason + ", noOfDays=" + noOfDays + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from airpot");
		
		if(obj != null) {
			
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto = (HolidayDTO)obj;
				if(dto.reason.equals(this.reason)) {
					return true;
				}
			}
			
		}
		return false;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	

}
