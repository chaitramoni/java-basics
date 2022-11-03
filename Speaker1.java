class Speaker1
{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume = 8;
	static int currentVolume;
	
	
	
	public static boolean onOrOff()
	{
	System.out.println("inside onOrOff");
	if (isConnected == false)
	{
	
		isConnected = true ;
	System.out.println("Speaker is turned Onn... ");
	}
	else if (isConnected == true)
	{	
	isConnected = false;
	System.out.println("Speaker is Turned Off...");
	
	
	}
	
	System.out.println("end of onOrOff");
	return isConnected ;
	
	}
	
	public static void increaseVolume()
	{
	
System.out.println("Inside increaseVolume()");

	if (isConnected == true)
	{
	if (currentVolume < maxVolume)
	{
	     currentVolume =  currentVolume + 1;
	     System.out.println("The current Volume is :" + currentVolume);
	}
   	
	else
	{ 
	    System.out.println("Max Volume reached.....");
	}
	}
	
	else
	{
		System.out.println("Gubhe First Speaker On Madu");
	}
	 
 System.out.println("End of increase volume");
	 
  }
	
	
	
	
	public static void decreaseVolume()
	{
		
System.out.println("Inside decreaseVolume()");


	if (isConnected == true)
	 {

		if(currentVolume > minVolume)
		{
	      currentVolume = currentVolume - 1;
	      System.out.println("The current Volume is :"+  currentVolume);
        }
        else
        {
          System.out.println("Min Volume reached");	
        }	
     }
   
   else
   {
	System.out.println("Gubhe first speaker on maddu ");
   }
	System.out.println ("End of decreaseVolume()");
	
	
}	
	}	