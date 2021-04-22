package com.smlsnnshn.Assignments.Assignment13;

import java.util.Arrays;

// Scalar multiplication of matrix is the simplest and easiest way to multiply matrix . 
// Basically you get an int 2d array and need to multiply each of its elements by the 
// value of parameter n int. And return the same 2D array back.
// Sample Output:
// matrix = 
// [1,1,1]
// [1,1,2]
// scalar(matrix,5)
// returns(after multiplying each value by 5):
// [5,5,5]
// [5,5,10]
// matrix = 
// [2,3,5]
// [1,1,2]
// scalar(matrix,2)
// returns:
// [4,6,10]
// [2,2,4]

public class Question_79 {

	public static void main(String[] args) {
		
		int[][] matrix1 = {{1,1,1},{1,1,2}};
		int n1 = 5;
		
		int[][] matrix2 = {{2,3,5},{1,1,2}};
		int n2 = 2;
		
		System.out.println("matrix1            => " + Arrays.deepToString(matrix1));
		System.out.println("scalar(matrix1, " + n1 + ") => " + Arrays.deepToString(scalar(matrix1, n1)));
		System.out.println();
		System.out.println("matrix2            => " + Arrays.deepToString(matrix2));
		System.out.println("scalar(matrix2, " + n2 + ") => " + Arrays.deepToString(scalar(matrix2, n2)));

	}
	
	public static int[][] scalar(int[][] arr, int n){
		
		for (int i=0; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] *= n; 
			}
		}
		
		return arr;
		
	}

}
