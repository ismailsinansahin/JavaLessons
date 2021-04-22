package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// Given a 2d array of ints, find the biggest number(integer) and replace 
// all array values on the biggest number in the array then print an array.
// Sample Output:
//     Given values: [[1, 2, 3], [5, 33, 9]]
//     output: [[33, 33, 33], [33, 33, 33]]

public class Question_58 {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3},{5,33,9}};
		System.out.println("Given Values => " + Arrays.deepToString(arr));
		
		int max = arr[0][0];
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[0].length ; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		
		System.out.println();
		
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[0].length ; j++) {
				arr[i][j] = max;
			}
		}
		
		System.out.println("Output       => " + Arrays.deepToString(arr));		

	}

}
