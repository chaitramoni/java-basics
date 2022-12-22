package com.xworkz.collectionapp;

import java.util.Collection;
import java.util.TreeSet;

public class Currency {
	
	public static void main(String[] arg)
	{
		String currency1 ="ruppee";
		String currency2 ="dolar";
		String currency3 ="afgani";
		String currency4 ="taka";
		String currency5 ="agultrum";
		String currency6 ="boliviano";
		String currency7 ="real";
		String currency8 ="lev";
		String currency9 ="riel";
		String currency10 ="yuan renminbi";
		String currency11 ="colon";
		String currency12 ="kuna";
		String currency13 ="cedi";
		String currency14 ="forint";
		String currency15 ="krona";
		String currency16 ="rupiah";
		String currency17 ="yen";
		String currency18 ="tenge";
		String currency19 ="ariary";
		String currency20 ="ringgit";
		String currency21 ="rufiyaa";
		String currency22 ="tugrik";
		String currency23 ="dirham";
		String currency24 ="kyat";
		String currency25 ="naira";
		String currency26 ="balboa";
		
		Collection collection = new TreeSet();
		
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency7);
		collection.add(currency18);
		collection.add(currency11);
		
		
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("After clear.........");
	
	System.out.println(collection.size());
		
	}

}
