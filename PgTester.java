class PgTester
{
	public static void main(String a[])
	{
		
	
	Pg.setPgName("Dazzling PG");
	System.out.println(Pg.getPgName());
	
	Pg.setAddress("Malleshwaram");
	System.out.println(Pg.getAddress());
	
	Pg.PgRent(2000);
	System.out.println(Pg.getPgRent());
	}

}