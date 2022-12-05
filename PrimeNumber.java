class PrimeNumber
{
	public static void main(String a[])
	
	{
	int num = 32;
	boolean flag = false;
	
		for(int i = 2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
			flag = true;
			}
		
		}
	
	if(!flag)
	System.out.println("Is a Prime Number" + num);
	
	else
	System.out.println("Is Not a PrimeNumber" + num);
	}

}