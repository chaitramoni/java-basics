package com.xworkz.watchapp;

public class WatchTester {
	public static void main(String a[])
	{
	
	Watch watch = new Watch("GF34","Black","G564","Boat","Analog");
	System.out.println("Watch Details");
	System.out.println(watch.watchId + " " + watch.watchColor + " " + watch.watchPrice + " " + watch.brandName + " " + watch.watchType);
	
	Watch watch1 = new Watch("KF345","White","U876","Fasttrack","Digital");
	System.out.println("Watch Details");
	System.out.println(watch1.watchId + " " + watch1.watchColor + " " + watch1.watchPrice + " " + watch1.brandName + " " + watch1.watchType);
	
	}

}
