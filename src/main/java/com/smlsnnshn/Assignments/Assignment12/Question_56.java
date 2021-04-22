package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
// You may modify and print the given array, or print a new array.
// Sample Output:
//     input: 6, 2, 5, 3
//     output: [2, 5, 3, 6]

public class Question_56 {

	public static void main(String[] args) {
		
		int [] arr = {6,2,5,3};
		
		System.out.println("arr          -> " + Arrays.toString(arr));
		System.out.println("left shifted -> " + Arrays.toString(leftShifter(arr)));

	}
	
	public static int[] leftShifter(int[] arr) {
		
		int temp = arr[0];
		for (int i=0 ; i<arr.length-1 ; i++) {		
			arr[i] = arr[i+1];			
		}
		arr[arr.length-1] = temp;
		
		return arr;
		
	}

}
