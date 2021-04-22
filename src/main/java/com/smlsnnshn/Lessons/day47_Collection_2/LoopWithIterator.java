package com.smlsnnshn.Lessons.day47_Collection_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LoopWithIterator {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//create iterator object
		
		Iterator<Integer> it = nums.iterator();
		
		//call hashNext method
		//hashNext return true if there is still next value
		//return false when it reaches the end or empty
		
		System.out.println("it.hasNext() : " + it.hasNext());
		System.out.println("it.next() " + it.next());
		System.out.println("it.next() " + it.next());
		System.out.println("it.next() " + it.next());
		System.out.println("it.next() " + it.next());
		
		System.out.println("===================");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//System.out.println(it.next()); 
		
		System.out.println("===================");

		Iterator<Integer> it2 = nums.iterator();
		
		//what is the difference between for each loop and iterator?
		//we can remove objects while looping
		
		while (it2.hasNext()) {
			int val = it2.next();
			if (val>1000) {
				it2.remove();
			}
		}
		
		System.out.println(nums.toString());
		
		System.out.println("===================");
		
		
		List<String> cities = new ArrayList<>();
		
		cities.add("NewYork");
		cities.add("Boston");
		cities.add("Virgina");
		cities.add("DC");
		
		System.out.print(cities.toString());
		System.out.println();
		
		for (String each : cities) {
			if (each.equals("Boston")) {
				cities.remove(each);
			}
		}
		
		System.out.print(cities.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
