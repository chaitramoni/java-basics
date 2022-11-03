class CitizenOfIndia
{
	public static void showTheResponsibility()
	{
	System.out.println("invoked showTheResponsibility");
	
	int age = 21;
	char gender = 'F';
	
	if(age >= 10 && age < 16)
	{
	System.out.println("Responsibility is School");
	return;
	}
	if (age == 16)
	{
	System.out.println("Responsibility is College");
	return;
	}
	if(age >= 21)
	{
	System.out.println("Responsibility is voting");
	
		if(gender =='F')
		{
	 	  System.out.println("Girl can legally marry");	
	    }
	else
	{
		System.out.println("Boy can not marry");
	}
	
	
	}


	}
}