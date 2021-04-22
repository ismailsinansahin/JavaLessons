package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
// For example, the square matrix is shown below:
// 1 2 3
// 4 5 6
// 9 8 9
// The left-to-right diagonal = 1+5+9 = 15. The right to left diagonal = 3+5+9 = 17. 
// Their absolute difference is |15-17| = 2.

public class Question_57 {

	public static void main(String[] args) {
		
		int [][] squareMatrix = {{1,2,3},{4,5,6},{9,8,9}};	
		
		int total1 = 0;
		int total2 = 0;
		
		for (int i=0 ; i<squareMatrix.length ; i++) {
			total1 += squareMatrix[i][i];
			total2 += squareMatrix[i][squareMatrix.length-1-i];
		}
		
		System.out.println("Square Matrix       => " + Arrays.deepToString(squareMatrix));
		System.out.println("Absolute Difference => " + Math.abs(total1-total2));

	}

}

