package com.smlsnnshn.Lessons.day47_Collection_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		for (Integer each : mySet) {
			System.out.print(each + " | ");
		}
		System.out.println();
		
		mySet.forEach(each -> System.out.print(each + " | "));

	}

}
