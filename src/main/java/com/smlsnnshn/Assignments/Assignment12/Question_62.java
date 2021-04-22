package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Write a method that will take an argument of ArrayList of Integers called ints, 
// find and return the sum of all the Integers in ints.

public class Question_62 {

	public static void main(String[] args) {
	
		ArrayList <Integer> ints = new ArrayList <Integer>();
		
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		ints.add(5);
		
		System.out.println("ints => " + ints);
		System.out.println("Sum of all the integers in the ints => " + sumInt(ints));
		
	}
	
	public static int sumInt(ArrayList <Integer> ints) {
		
		int sum = 0;
		for (int each : ints) {
			sum += each;
		}
		return sum;
	}

}
