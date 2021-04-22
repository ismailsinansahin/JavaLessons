package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// Declare and create a two-dimensional array of ints called values, 
// with 2 rows, and initialize the first row to 8, 20, 50 and the second row to 12, 30, 75.
// Sample output:
//     [[8, 20, 50], [12, 30, 75]]

public class Question_54 {

	public static void main(String[] args) {
		
		int [][] values = {{8,20,50},{12,30,75}};	
		System.out.println("ints -> " + Arrays.deepToString(values));

	}

}
