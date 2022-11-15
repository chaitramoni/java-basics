package com.xworkz.watchapp;

public class Watch {
	public String watchId;
	public String watchColor;
	public String watchPrice;
	public String brandName;
	public String watchType;
	//constructor
	public Watch()
	{
	}
	//parameterized constructor
	public Watch(String wId,String wColor,String wPrice,String bName,String wType)
	{
		watchId = wId;
		watchColor = wColor;
		watchPrice = wPrice;
		brandName = bName;
		watchType = wType;
	}
	public void toBeInTime()
	{
		System.out.println("My Watch");
	}

}
