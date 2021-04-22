package com.smlsnnshn.Lessons.day31_ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//Print number of items
		
		int count = shoppingList.size();
		System.out.println(count);

		//Print all items in single line
		
		System.out.println(shoppingList.toString());
		
		//Print first and last item in single line
		
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count-1));
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		
		//Print each item

		for (String each : shoppingList) {
			System.out.println(each);
		}
		
		//remove all items at once
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
		
		
		
		
	}

}
