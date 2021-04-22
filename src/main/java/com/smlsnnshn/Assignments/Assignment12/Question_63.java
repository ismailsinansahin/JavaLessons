package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Write a method that will take an argument of ArrayList of Doubles called doubles, 
// and remove the first two elements in ArrayList and return the final list.

public class Question_63 {

	public static void main(String[] args) {
		
		ArrayList <Double> arr = new ArrayList <Double>();
		
		arr.add(1.5);
		arr.add(2.5);
		arr.add(3.5);
		arr.add(4.5);
		arr.add(5.5);
		
		System.out.println("Initial List => " + arr);
		System.out.println("Final List   => " + firstTwo(arr));
		
	}
	
	public static ArrayList <Double> firstTwo(ArrayList <Double> arr) {
		
		arr.remove(0);
		arr.remove(0);
		return arr;
		
	}

}
