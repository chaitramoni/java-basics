class TouritsPlaces
{
	static String touritsPlacesName[] = {null,null,null};
	static int index;
	
	public static boolean addTouritsPlacesName(String TouritsPlacesName)
	{
	System.out.println("Inside addTouritsPlacesName");
	touritsPlacesName[index] = touritsPlacesName;
	    index++;
	System.out.println("End of the addTouritsPlacessName");
    }

	public static void getTouritsPlaceName()
	{
	for(int index = 0;index < touritsPlacesName.length;index++)
	{
	String ref = touritsPlacesName[index];
	System.out.println("TouritsPlaces Name is" + ref);
	}
	
	}
	
	

}