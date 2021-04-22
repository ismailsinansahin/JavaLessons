package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given an int array, print a new array with double the length 
// where its last element is the same as the original array, 
// and all the other elements are 0. The original array will be 
// length 1 or more. Note: by default, a new int array contains all 0's.
// Sample Output:
//     input: 4 5 6
//     output: [0, 0, 0, 0, 0, 6]
//     input: 0
//     output: [0, 0]
//     input: 1 2 3 4
//     output: [0, 0, 0, 0, 0, 0, 0, 4]

public class Question_50 {
	    		 
	public static void main(String[] args) {
		
		int [] arr1 = {4,5,6};
		int [] arr2 = {0};
		int [] arr3 = {1,2,3,4};
			
		System.out.println("arr     -> " + Arrays.toString(arr1));
		System.out.println("newArray-> " + Arrays.toString(doubleLast(arr1)));
		System.out.println();
		
		System.out.println("arr     -> " + Arrays.toString(arr2));
		System.out.println("newArray-> " + Arrays.toString(doubleLast(arr2)));
		System.out.println();
		
		System.out.println("arr     -> " + Arrays.toString(arr3));
		System.out.println("newArray-> " + Arrays.toString(doubleLast(arr3)));
		
	}
	
	public static int[] doubleLast(int[] arr) {
		
		int [] newArray = new int [arr.length*2];		
		newArray[newArray.length-1] = arr[arr.length-1];
		return newArray;
		
	}

}
