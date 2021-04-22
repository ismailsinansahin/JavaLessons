package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given an array of ints, print true if the array contains a 5 next to a 5 
// anywhere in the array. If no consecutive 5s or no 5s are detected in your 
// code then print false.
// Sample output:
//   nums → [1, 5, 5, 1, 1] → true
//   nums → [1, 8, 5, 5, 0] → true
//   nums → [1, 5, 4, 1, 5] → false
//   nums → [1, 4, 4, 1, 99] → false

import java.util.Scanner;

public class Question_36 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		int [] nums = new int[5];
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("Please enter number " + (i+1) + " : ");
			nums[i] = input.nextInt();
		}
		input.close();
		
		boolean flag = false;
		
		for (int i=0 ; i<4 ; i++) {
			if (nums[i]==5 && nums [i+1]==5) {
				flag = true;
			}
		}
		
		System.out.println();		
		System.out.println("Nums => " + Arrays.toString(nums) + " -> " + flag);
		System.out.println();
		
	}

}
