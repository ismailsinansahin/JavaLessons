package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// Given an array nums, calculate the count of even numbers in nums and print out to console.
// Sample Output:
//   nums → [2, 1, 2, 3, 4]) → 3
//   nums → [2, 2, 0, 3, 5]) → 3
//   nums → [1, 3, 5, 7, 9]) → 0

public class Question_38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		int [] nums = new int[5];
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("Please enter number " + (i+1) + " : ");
			nums[i] = input.nextInt();
		}
		input.close();
		
		int counter=0;
		
		for (int i=0 ; i<5 ; i++) {
			if (nums[i]%2==0) {
				counter++;
			}
		}
		
		System.out.println();		
		System.out.println("Nums => " + Arrays.toString(nums) + " -> " + counter);
		System.out.println();
		
	}

}
