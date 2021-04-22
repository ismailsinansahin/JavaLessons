package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given an array nums with 7 integers already assigned, 
// write code to reverse it. Do not use any additional arrays or Strings.
// Sample Output:
//  nums -> [4, 3, 2, 44, 1, 100, 55]
//    change it to:
//  nums -> [55, 100, 1, 44, 2, 3, 4]

public class Question_43 {
				
	public static void main(String[] args) {
		
		int[] nums1 = {4, 3, 2, 44, 1, 100, 5};
		int[] nums2 = {55, 100, 1, 44, 2, 3, 4};
		
		System.out.println("nums          -> " + Arrays.toString(nums1));
		System.out.println("nums(reversed)-> " + Arrays.toString(reverseArray(nums1)));
		
		System.out.println();
		System.out.println("nums          -> " + Arrays.toString(nums2));
		System.out.println("nums(reversed)-> " + Arrays.toString(reverseArray(nums2)));

	}
	
	public static int[] reverseArray (int[] nums) {
				
		int temp = 0;
		for (int i=0 ; i<3 ; i++) {
			temp = nums[i];
			nums[i] = nums[nums.length-1-i];
			nums[nums.length-1-i] = temp;		
		}
		
		return nums;
		
	}

}
