package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsOfIndia {
	
	public static void main(String[] args) {
		
	
		Collection<String> karnataka = new ArrayList<String>();
		karnataka.add("Hemavathi");
		karnataka.add("Almati");
		karnataka.add("Bhadra");
		karnataka.add("kadar");
		karnataka.add("RenukaSagar");
		
		Collection<String> kerala = new ArrayList<String>();
		kerala.add("Pothundi");
		kerala.add("Idukki");
		kerala.add("Neyyar");
		kerala.add("Mangalam");
		kerala.add("Malankara");
		
		Collection<String> goa = new ArrayList<String>();
		goa.add("Amthane");
		goa.add("Anjunem");
		goa.add("Panchwai");
		goa.add("Chapoli");
		goa.add("Salaulim");
		
		Collection<String> himachalpradesh = new ArrayList<String>();
		himachalpradesh.add("Barisiul");
		himachalpradesh.add("Bassi");
		himachalpradesh.add("Bhakra");
		himachalpradesh.add("Chamera");
		himachalpradesh.add("Karcham");
		
		Collection<String> arunachalpradesh = new ArrayList<String>();
		arunachalpradesh.add("Dibang");
		arunachalpradesh.add("Ranganadi");
		arunachalpradesh.add("Subhansiri");
		arunachalpradesh.add("Mega");
		arunachalpradesh.add("Lama");
		
		Collection<String> rajasthan = new ArrayList<String>();
		rajasthan.add("Ranapratap");
		rajasthan.add("Mashi");
		rajasthan.add("Chandelao");
		rajasthan.add("Manasarovar");
		rajasthan.add("mahadev");
		
		Collection<String> uttarpradesh = new ArrayList<String>();
		uttarpradesh.add("Rajghat");
		uttarpradesh.add("Matatila");
		uttarpradesh.add("Dhanraul");
		uttarpradesh.add("Parichha");
		uttarpradesh.add("Shada");
		
		Collection<String> bihar = new ArrayList<String>();
		bihar.add("ajan");
		bihar.add("Amrity");
		bihar.add("Badua");
		bihar.add("Barna");
		bihar.add("Rihand");
		
		Collection<String> westbengal = new ArrayList<String>();
		westbengal.add("Nagarjuna");
		westbengal.add("Koyna");
		westbengal.add("Bhakranangal");
		westbengal.add("Tiliyana");
		westbengal.add("Bhandu");
		
		Collection<String> haryana = new ArrayList<String>();
		haryana.add("Kaushalya");
		haryana.add("Ottubarrage");
		haryana.add("Tajewala");
		haryana.add("Hathnikund");
		haryana.add("Anagpur");
		
		Collection<String> gujarat = new ArrayList<String>();
		gujarat.add("dantiwada");
		gujarat.add("Sardarsarovar");
		gujarat.add("Dharoi");
		gujarat.add("Ukai");
		gujarat.add("Kadana");
		
		Collection<String> meghalaya = new ArrayList<String>();
		meghalaya.add("Khandong");
		meghalaya.add("Kyrdemkulai");
		meghalaya.add("Mawphlang");
		meghalaya.add("Myntduleshka");
		meghalaya.add("Umtru");
		
		Collection<String> mizoram = new ArrayList<String>();
		mizoram .add("Serlui");
		mizoram .add("Tuirial");
//		
		Collection<String> odissa = new ArrayList<String>();
		odissa.add("Alubhani");
		odissa.add("Aradei");
		odissa.add("Arikul");
		odissa.add("Badabandha");
		odissa.add("Kala");
		
		Collection<String> assam = new ArrayList<String>();
		assam.add("Karbi");
		assam.add("Umrong");
		assam.add("Pagladai");
		assam.add("Khandong");
		assam.add("Amkachi");
		
		Collection<String> sikkim = new ArrayList<String>();
		sikkim.add("Rangit");
		sikkim.add("Rangpo");
		sikkim.add("Rongli");
		sikkim.add("Teesta");
		
		
		Collection<String> nagaland  = new ArrayList<String>();
		nagaland.add("Doyang");
		nagaland.add("Dungki");
		nagaland.add("Chumukedima");
		nagaland.add("Dikhu");
		nagaland.add("Morangali");
		
		Collection<String> madhyapradesh = new ArrayList<String>();
		madhyapradesh.add("Indrasagar");
		madhyapradesh.add("Tigra");
		madhyapradesh.add("Barna");
		madhyapradesh.add("Dhuty");
		madhyapradesh.add("Morwan");
		
		Collection<String> jharkhand = new ArrayList<String>();
		jharkhand.add("Amanta");
		jharkhand.add("Anjanwal");
		jharkhand.add("Anraj");
		jharkhand.add("Baksa");
		jharkhand.add("Palna");
		
		Collection<String> chhattisgarh = new ArrayList<String>();
		chhattisgarh.add("Hasdeo");
		chhattisgarh.add("Adpather");
		chhattisgarh.add("Agariya");
		chhattisgarh.add("Ajabnagar");
		chhattisgarh.add("Almatti");
		
		Collection<String> uttarkhand = new ArrayList<String>();
		uttarkhand.add("Tehri");
		uttarkhand.add("Haripura");
		uttarkhand.add("Tumria");
		uttarkhand.add("Koteshwar");
		uttarkhand.add("Bhalu");
		
		Collection<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Bhama");
		maharashtra.add("Mandohol");
		maharashtra.add("Aswali");
		maharashtra.add("Kashyapi");
		maharashtra.add("Bhushi");
		
		Collection<String> manipura = new ArrayList<String>();
		manipura.add("Singada");
		manipura.add("Khoupum");
		manipura.add("Maphou");
		manipura.add("Thenjiol");
		manipura.add("Khomunnom");
		
		Collection<String> tripura = new ArrayList<String>();
		tripura.add("Gumti");
		
		
		
		Collection<String> value = new ArrayList<String>();
		
		value.addAll(karnataka);
		value.addAll(kerala);
		value.addAll(goa);
		value.addAll(himachalpradesh);
		value.addAll(arunachalpradesh);
		value.addAll(rajasthan);
		value.addAll(uttarpradesh);
		value.addAll(bihar);
		value.addAll(westbengal);
		value.addAll(haryana);
		value.addAll(gujarat);
		value.addAll(meghalaya);
		value.addAll(mizoram);
		value.addAll(odissa);
		value.addAll(assam);
		value.addAll(sikkim);
		value.addAll(nagaland);
		value.addAll(madhyapradesh);
		value.addAll(jharkhand);
		value.addAll(chhattisgarh);
		value.addAll(uttarkhand);
		value.addAll(maharashtra);
		value.addAll(manipura);
		value.addAll(tripura);
		
		System.out.println("===========================================");
		Iterator<String> data = value.iterator();
		while(data.hasNext()) {
			String str2 = data.next();
			System.out.println(str2);
		}
		
		
		System.out.println("===========================================");
		
		
		System.out.print(value.size());
		
		System.out.println("===========================================");
		
		Iterator<String> dams = value.iterator();
		while(dams.hasNext()) {
			String element = dams.next();
			if(element.startsWith("T")) {
				System.out.println("Elements stats with T: " + element);
			}
		}
		
		System.out.println("===========================================");
		
		System.out.println("===REMOVE ELEMENT=====");
		
		Iterator<String> itr = value.iterator();
		while(itr.hasNext()) {
			String element1 = itr.next();
			if(element1.endsWith("ra")){
				System.out.println("Removing elements ending with ra:" + element1 );
				itr.remove();
			}
		}
		
		System.out.println("===========================================");
		
		System.out.println("Size before removing "+ value.size());
		boolean removed = value.remove("Palna") ;
		System.out.println(removed);
		System.out.println("Size after removing "+ value.size());
		
		
		
		
		}
	
	}


