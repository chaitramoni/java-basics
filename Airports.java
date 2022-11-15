class Airports
{
	static String airportsName[] = {null,null,null};
	static int index;
	
	public static boolean addAirportsName(String AirportsName)
	{
	System.out.println("Inside addAirportsName");
	airportsName[index] = airportsName;
	    index++;
	System.out.println("End of the addAirportsName");
    }

	public static void getAirportsName()
	{
	for(int index = 0;index < airportsName.length;index++)
	{
	String ref = airportsName[index];
	System.out.println("Airports Name is" + ref);
	}
	
	}
	
	

}