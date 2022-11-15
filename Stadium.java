class Stadium
{
	static String stadiumName[] = {null,null,null};
	static int index;
	
	public static boolean addStadiumName(String stadiumName)
	{
	System.out.println("inside the addStadiumName");
	stadiumName[index++] = stadiumName;
	    
	System.out.println("End of addStadiumName");
	
	}
	
	
	public static void getStadiumName()
	{
	for(int index = 0;index < stadiumName.length;index++)
	{
	String ref = stadiumName[index];
	System.out.println("Stadium Name is" + ref);
	}
	
	}
	
	

}