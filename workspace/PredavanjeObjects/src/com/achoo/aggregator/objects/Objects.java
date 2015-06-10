package com.achoo.aggregator.objects;

import com.achoo.aggregator.models.Planets;
public class Objects {

	public static void main(String args[]){
		Planets pl = new Planets(1000,600,"Lopta","Pluton");
		pl.dodajMasu(60);
		pl.dodajMasu(84);
		System.out.println("PL masa: "+pl.vrijednostMase());
		System.out.println("PL tezina: "+pl.racunajTezinu());
	
		Planets bl = new Planets(435, 444, "Kocka","Kockasta");
		bl.dodajMasu(-500);
		System.out.println("BL masa: "+bl.vrijednostMase());
		System.out.println("BL tezina: "+bl.racunajTezinu());
		
		bl.dodajMasu(-300);
		System.out.println("BL masa: "+bl.vrijednostMase());
		System.out.println("BL tezina: "+bl.racunajTezinu());
		
	}
}
