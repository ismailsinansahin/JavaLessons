package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// Given an 8x8 two-dimensional array of strings named chessboard. 
// Initialize values inside an array accordingly to the chessboard. 
// So first element in the array, chessboard[0][0] should have value 
// "1a", and the last element in the array, chessboard[7][7] should have value "8h".
//
// Sample Output:
//
// [[1a, 1b, 1c, 1d, 1e, 1f, 1g, 1h], 
// [2a, 2b, 2c, 2d, 2e, 2f, 2g, 2h], 
// [3a, 3b, 3c, 3d, 3e, 3f, 3g, 3h], 
// [4a, 4b, 4c, 4d, 4e, 4f, 4g, 4h], 
// [5a, 5b, 5c, 5d, 5e, 5f, 5g, 5h], 
// [6a, 6b, 6c, 6d, 6e, 6f, 6g, 6h], 
// [7a, 7b, 7c, 7d, 7e, 7f, 7g, 7h], 
// [8a, 8b, 8c, 8d, 8e, 8f, 8g, 8h]]

public class Question_55 {

	public static void main(String[] args) {
		
		String [][] chessboard = new String [8][8];
		String [] letters = {"a","b","c","d","e","f","g","h"};
		
		for (int i=0 ; i<8 ; i++) {
			for (int j=0 ; j<8 ; j++) {
				chessboard[i][j] = (i+1) + letters[j];
			}		
		}
		
		System.out.println(Arrays.deepToString(chessboard));

	}

}
