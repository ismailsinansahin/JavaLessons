package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Create a method that is called timesTwo takes in a single parameter - 
// an ArrayList of Integers called nums returns nothing
// This method should take the ArrayList parameter and multiply every value by two.

public class Question_67 {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList <Integer>();
		
		nums.add(10);
		nums.add(-25);
		nums.add(30);
		nums.add(-45);
		nums.add(50);
				
		System.out.println("nums      => " + nums);
		timesTwo(nums);

	}
	
	public static void timesTwo(ArrayList <Integer> nums){
		
		for (int i=0 ; i<nums.size() ; i++) {
			nums.set(i, nums.get(i)*2);
		}
	
		System.out.println("timesTwo  => " + nums);
		
	}

}