package com.xworkz.weaponapp;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.weaponapp.constant.Type;
import com.xworkz.weaponapp.dto.WeaponDTO;

public class WeaponDTORunner {
	
	public static void main(String[] args) {
		WeaponDTO dto1 = new WeaponDTO("bow and arrow","wood",1896,20.5,Type.Hunting);
		WeaponDTO dto2 = new WeaponDTO("Axe","Steel",1846,80.5,Type.Fighting);
		WeaponDTO dto3 = new WeaponDTO("machine gun","steel",1886,70.5,Type.Firing);
		WeaponDTO dto4 = new WeaponDTO("bomb","Steel",1826,20.5,Type.Firing);
		WeaponDTO dto5 = new WeaponDTO("riffel","Steel",1836,30.5,Type.Fighting);
		WeaponDTO dto6 = new WeaponDTO("knife","Steel",1846,40.5,Type.Hunting);
		WeaponDTO dto7 = new WeaponDTO("sub machine gun","Metal",1856,50.5,Type.Firing);
		WeaponDTO dto8 = new WeaponDTO("sword","metal",1866,60.5,Type.Fighting);
		WeaponDTO dto9 = new WeaponDTO("pistul","Steel",1876,70.5,Type.Hunting);
		WeaponDTO dto10 = new WeaponDTO("spear","metal",1886,80.5,Type.Fighting);
		WeaponDTO dto11 = new WeaponDTO("cannon","metal",1896,80.5,Type.Hunting);
		WeaponDTO dto12 = new WeaponDTO("missil","metal",1896,20.5,Type.Fighting);
		WeaponDTO dto13 = new WeaponDTO("tanks","steel",1856,20.5,Type.Hunting);
		WeaponDTO dto14 = new WeaponDTO("nuclear bomb","metal",1896,20.5,Type.Firing);
		WeaponDTO dto15 = new WeaponDTO("rocket","metal",1896,20.5,Type.Hunting);
		WeaponDTO dto16 = new WeaponDTO("short gun","metal",1856,50.5,Type.Firing);
		WeaponDTO dto17 = new WeaponDTO("revolver","metal",1896,30.5,Type.Hunting);
		WeaponDTO dto18 = new WeaponDTO("Sniper rifle","metal",1876,80.5,Type.Hunting);
		WeaponDTO dto19 = new WeaponDTO("crossbow","wood",1886,70.5,Type.Hunting);
		WeaponDTO dto20 = new WeaponDTO("m4 carbine","steel",1896,30.5,Type.Hunting);
		
		Collection<WeaponDTO> dto = Stream
				.of(dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10,dto11,dto12,dto13,dto14,dto15,dto16,dto17,dto18,dto19,dto20)
				.collect(Collectors.toList());
		
		//find and print all weapon greater than 
		dto
		.stream()
		.filter(weapon-> weapon.getPrice()>20.5)
		.collect(Collectors.toList())
		.forEach(weapon->System.out.println("weapon price greater than20.5" + weapon));
		
		
		
				//find and print all madeBy and madeOn
		
		dto
		.stream()
		.filter(weapon -> weapon.getMadeBy() == "wood")
		.map(weapon->weapon.getName())
		.collect(Collectors.toList())
		.forEach(weapon->System.out.println("Print the weapon madeBy" +weapon));
		
		dto
		.stream()
		.filter(weapon -> weapon.getMadeOn() == 1896)
		.map(weapon->weapon.getName())
		.collect(Collectors.toList())
		.forEach(weapon->System.out.println("Print the weapon madeOn" +weapon));
		
		//find and print all weapons by name sorted in desc order
//		
//		dto
//		.stream()
//		.sorted()
//		.forEach(str -> System.out.println(str));
		
		System.out.println("==============================================");
		
		//print all weapons sort by madeBy
	dto
	.stream()
	.sorted((a1, a2) -> a1.getMadeBy().compareToIgnoreCase(a2.getMadeBy()))
	.collect(Collectors.toList())
	.forEach(str -> System.out.println("Weapons sort by made By" + str));
	
	System.out.println("==============================================");
	////print all weapons sort by madeOn
	
	dto
	.stream()
	.sorted((a1,a2)-> a1.getMadeOn().compareTo(a2.getMadeOn()))
	.collect(Collectors.toList())
	.forEach(str-> System.out.println("Weapons sort by made On" + str));
	
	System.out.println("==============================================");
////print all weapons sort by price
	System.out.println("==============================================");
	dto
	.stream()
	.sorted((a1,a2)-> a1.getPrice().compareTo(a2.getPrice()))
	.collect(Collectors.toList())
	.forEach(str-> System.out.println(str));
	
	System.out.println("==============================================");
	
////print all weapons sort by price in desc
	System.out.println("weapons sort by price in desc");
	dto
	.stream()
	.sorted((a1,a2)-> a1.getPrice().compareTo(a2.getPrice()))
	.collect(Collectors.toList())
	.forEach(str-> System.out.println(str));
	
	System.out.println("==============================================");
	//sort by name and madeOn asc order
	
	dto
	.stream()
	.sorted((a1,a2) -> a2.getName().compareTo(a1.getName()))
	.sorted((a1,a2) -> a2.getMadeOn().compareTo(a1.getMadeOn()))
	.forEach(str ->System.out.println(str.getName() + " " + str.getMadeOn()));

	
	//type name madeBy
	dto
	.stream()
	.sorted((a1,a2) -> a2.getType().compareTo(a1.getType()))
	.sorted((a1,a2) -> a2.getName().compareTo(a1.getName()))
	.sorted((a1,a2) -> a2.getMadeBy().compareTo(a1.getMadeBy()))
	.forEach(str ->System.out.println(str.getName() + " " + str.getMadeOn() + " " + str.getType()));
	
	
	}

}
