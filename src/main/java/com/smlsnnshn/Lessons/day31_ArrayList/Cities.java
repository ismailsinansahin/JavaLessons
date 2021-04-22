package com.smlsnnshn.Lessons.day31_ArrayList;

import java.util.ArrayList;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for-each loop seperated by space
		
		for (String city : cities) {
			System.out.println(city + " ");
		}
		
		//Print each city by using for-iterator loop
		
		for (int i=0 ; i<cities.size(); i++) {
			System.out.println(cities.get(i) + " ");
		}
		
		//Removing Baku
		
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		
		System.out.println(cities.toString());
		
		cities.add(0, "Arlington");
		cities.add(1, "İstanbul");
		
		System.out.println(cities.toString());
		
		cities.add(2, "Ankara");
		
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("İstanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
