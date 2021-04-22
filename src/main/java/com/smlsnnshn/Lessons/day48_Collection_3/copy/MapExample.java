package com.smlsnnshn.Lessons.day48_Collection_3.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		
		items2.add(10);
				
		Map<String,Double> items = new HashMap<>();
		
		items.put("Apple", 3.49);
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherries", 5.99);
		items.put("Apple", 5.49);
		
		System.out.println(items.isEmpty());
				
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.keySet());
		
		System.out.println(items.values());
		
		System.out.println(items.get("Apple"));
		
		items.remove("Flowers");
		
		System.out.println(items.toString());
		
		System.out.println("Is apples there? " + items.containsKey("Apple"));
		
		items.replace("Eggs",3.5);
		System.out.println("Price of eggs: " + items.get("Eggs"));
		
		items.put("Milk", 2.6);
		System.out.println("Price of milk: " + items.get("Milk"));
		
		System.out.println(items.toString());
		
		//increase price of cherries $2
		items.replace("Cherries", items.get("Cherries")+2);
		
		System.out.println(items.toString());
		
		
		
	}

}
