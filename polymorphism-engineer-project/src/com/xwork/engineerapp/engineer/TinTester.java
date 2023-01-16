package com.xwork.engineerapp.engineer;

import com.xwork.engineerapp.Cococola;
import com.xwork.engineerapp.Pepsi;
import com.xwork.engineerapp.Tin;

public class TinTester {
	public static void main(String a[])
	{
		Tin cococola = new Cococola();
		cococola.storeLiquid();
		
		
		Tin pepsi = new Pepsi();//polymorphism
		pepsi.storeLiquid();
	}

}
