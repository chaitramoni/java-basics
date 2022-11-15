package com.xworkz.beachesapp;

public class BeachesTester {


static String beachNames[] = {null,null,null,null,null};
static int index;

//create,add,save,store Operation
public static boolean addBeachNames(String beachName)
{

System.out.println("Inside addBeachName");


if(beachNames.length <= 5)
{
	beachNames[index] = beachName;
    index++;
	System.out.println("Beaches are filled");
	return true;
}

else
{
System.out.println("Beach Names  are overloaded");
 return false;	
