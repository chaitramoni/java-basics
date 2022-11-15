class Beaches
{
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
	}
	

	
	
	
	
	
	}
	
	
	//Read Operation
	
	public static void getBeachNames()
	{
	for(int index = 0;index < beachNames.length;index++)
	{
	String ref = beachNames[index];
	System.out.println("Beach Name is" + ref);
	}
	
	}
	
	

}