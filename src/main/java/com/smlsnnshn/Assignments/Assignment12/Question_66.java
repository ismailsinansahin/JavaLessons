package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Create a method that is called appendPosSum takes one parameter: 
// an ArrayList of Integers and returns an ArrayList of Integers
// This method should:
// Create a new ArrayList of Integers
// Add only the positive Integers to the new ArrayList
// Sum the positive Integers in the new ArrayList and add the Sum as the last element
// For example, if the incoming ArrayList contains the Integers 
// (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), 
// with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.

public class Question_66 {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList <Integer>();
		
		nums.add(10);
		nums.add(-25);
		nums.add(30);
		nums.add(-45);
		nums.add(50);
		
		System.out.println("nums        => " + nums);
		System.out.println("sumPositive => " + sumPositive(nums));

	}
	
	public static ArrayList <Integer> sumPositive(ArrayList <Integer> nums){
		
		ArrayList <Integer> positiveNums = new ArrayList <Integer>();
		int total = 0;
		
		for (int each : nums) {
			if(each>0) {
				positiveNums.add(each);
			}
		}
		
		for (int each : positiveNums) {
			total += each;
		}
		
		positiveNums.add(total);
	
		return positiveNums;
		
	}

}
