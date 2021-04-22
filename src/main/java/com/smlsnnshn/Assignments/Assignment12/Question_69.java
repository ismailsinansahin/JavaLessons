package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Create a method that: is called repeatAL takes in a single parameter - 
// an ArrayList of Booleans and returns nothing
// This method should modify its ArrayList parameter by repeating its 
// ArrayList values.
// For example, if the parameter is 
//  (true, false, false)
// The modified ArrayList should be
//  (true, false, false, true, false, false)

public class Question_69 {

	public static void main(String[] args) {
		
		ArrayList <Boolean> arr = new ArrayList <Boolean>();
		
		arr.add(true);
		arr.add(false);
		arr.add(false);
			
		System.out.println("arr     => " + arr);
		repeatAL(arr);

	}
	
	public static void repeatAL(ArrayList <Boolean> arr){
		
		int size = arr.size();
		for (int i=0 ; i<size ; i++) {
			arr.add(arr.get(i));
		}
	
		System.out.println("repeatAL=> " + arr);
		
	}

}