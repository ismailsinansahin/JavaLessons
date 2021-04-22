package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given an int array of any length, print a new array of its first 2 elements. 
// If the array is smaller than length 2, use whatever elements are present.
// Sample Output:
//     input 1, 2, 3 
//     output: [1, 2]
//     input 1,
//     output: [1]

public class Question_49 {
	    		 
	public static void main(String[] args) {
		
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {1,2};
		int [] arr3 = {1};
		int [] arr4 = {};
				
		System.out.println("arr     -> " + Arrays.toString(arr1));
		returnTwo(arr1);
		System.out.println();
		
		System.out.println("arr     -> " + Arrays.toString(arr2));
		returnTwo(arr2);
		System.out.println();
		
		System.out.println("arr     -> " + Arrays.toString(arr3));
		returnTwo(arr3);
		System.out.println();
		
		System.out.println("arr     -> " + Arrays.toString(arr4));
		returnTwo(arr4);
	
	}	
	
	public static void returnTwo(int[] arr) {
		
		if (arr.length ==1){
			int [] newArray = new int[1];
			newArray[0] = arr[0];
			System.out.println("newArr  -> " + Arrays.toString(newArray));
			
		}
		if (arr.length >= 2){
			int [] newArray = new int[2];
			newArray[0] = arr[0];
			newArray[1] = arr[1];
			System.out.println("newArr  -> " + Arrays.toString(newArray));
			
		}
		
	}

}
