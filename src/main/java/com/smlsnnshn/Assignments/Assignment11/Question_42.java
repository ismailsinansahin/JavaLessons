package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
	
//	Given a String array arr with the following elements ["zero", "one", "two","three","four"]
//	Create another array fewValues and copy words that have letter "e" in them. You need to know 
//	how many element contain "e" and create array accordingly
//	Values in fewValues array need to be["zero", "one","three"]
//	Sample Output::
//	     arr -> ["aa", "be", "lol", "lel", "oreo"] 
//	     fewValues -> ["be", "lel", "oreo"]
//	     arr -> ["e", "hey", "bye", "furey", "spoon"] 
//	     fewValues ->["e", "hey", "bye", "furey"]

public class Question_42 {
	
	public static void main(String[] args) {
		
		String[] arr1 = {"aa", "be", "lol", "lel", "oreo"};
		String[] arr2 = {"e", "hey", "bye", "furey", "spoon"};
		
		System.out.println("arr       -> " + Arrays.toString(arr1));
		System.out.println("fewValues -> " + Arrays.toString(eValue(arr1)));
		
		System.out.println();
		System.out.println("arr       -> " + Arrays.toString(arr2));
		System.out.println("fewValues -> " + Arrays.toString(eValue(arr2)));

	}
	
	public static String[] eValue (String[] arr) {
		
		int counter = 0;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i].contains("e")) {
				counter++;
			}	
		}
		
		String[] fewValues = new String[counter];
		
		counter = 0;
		for (int i=0 ; i<arr.length ; i++) {
			if (arr[i].contains("e")) {
				fewValues[counter] = arr[i];
				counter++;
			}	
		}
		
		return fewValues;
		
	}

}







