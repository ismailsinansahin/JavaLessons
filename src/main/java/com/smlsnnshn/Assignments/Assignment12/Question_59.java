package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// mergR merges two arrays into one.
// it gets two int arrays and returns an int array
// Sample Output:
//     mergR([1,2,3],[4,5,6])
//     returns [1,2,3,4,5,6]
//     mergR([1,2],[6,8])
//     returns [1,2,6,8]

public class Question_59 {

	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2,3},{4,5,6}};
		int[][] arr2 = {{1,2},{6,8}};
		
		System.out.println("Initial Arrays => " + Arrays.deepToString(arr1));
		System.out.println("Merged Array   => " + Arrays.toString(mergR(arr1)));
		System.out.println();
		
		System.out.println("Initial Arrays => " + Arrays.deepToString(arr2));
		System.out.println("Merged Array   => " + Arrays.toString(mergR(arr2)));

	}
	
	public static int[] mergR(int[][] arr) {
		
		int counter = 0;
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				counter++;
			}
		}	
		
		int[] newArr = new int[counter];
		
		counter=0;
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				newArr[counter] = arr[i][j];
				counter++;
			}
		}
	
	return newArr;	
				
	}

}
