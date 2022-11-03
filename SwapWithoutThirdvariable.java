class SwapWithoutThirdVariable
{
	public static void main(String c[])
	{
	int a = 10;
	int b = 20;
	
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	
	
	System.out.println(a);
	System.out.println(b);
	}

}