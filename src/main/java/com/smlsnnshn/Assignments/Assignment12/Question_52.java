package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// You get a 2d array and you need to find how many two matches there are 
// and return the number(int) of matches you found.
// For example: 1 and 2 are not a match, 2 and 2 are a match.
// a match in this case is two numbers in a row that are equal .
// Sample output:
//     [2,2,1,3,4,5]
//     [5,2,3,3,4,5]
//     [3,2,3,1,4,5]
//     print
//     matches: 2

public class Question_52 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{2,2,1,3,4,5},
				{5,2,3,3,4,5},
				{3,2,3,1,4,5}
				};
		
		System.out.println("arr     -> " + Arrays.deepToString(arr));
		System.out.println("matches -> " + twoMatches(arr));
	}
	
	public static int twoMatches(int[][] arr) {
		
		int counter=0;
		for (int i=0 ; i<arr.length ; i++) {
			for ( int j=0 ; j<arr[i].length-2 ; j++) {
				if (arr[i][j] == arr[i][j+1]) {
					counter++;
					break;
				}		
			}
		}
		return counter;

	}

}
