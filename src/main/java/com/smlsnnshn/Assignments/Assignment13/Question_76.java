package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// Create a method that is called "twoTimes" takes in a single parameter - 
// an ArrayList of Integers and returns a new ArrayList of Integers
// This method should create a new ArrayList of Integers that contains 
// every value of the ArrayList parameter repeated twice.
//  For example, if the parameter is
//     (1,5,3,7)
//  The method should return a new ArrayList of Integers with
//     (1,1,5,5,3,3,7,7)

public class Question_76 {

	public static void main(String[] args) {
		 
		ArrayList <Integer> arr = new ArrayList <Integer>();
		
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		
		System.out.println("arr           => " + arr);
		System.out.println("twoTimes(arr) => " + twoTimes(arr));
	
	}
	
	public static ArrayList <Integer>  twoTimes(ArrayList <Integer> arr){
		
		ArrayList <Integer> newArr = new ArrayList <Integer>();

		for (int i=0 ; i<arr.size() ; i++) {
			newArr.add(arr.get(i));
			newArr.add(arr.get(i));

		}
	
		return newArr;
		
	}

}
