package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Switch the last element in an array with the first and return the array.
// Sample Output:
//     do_switch([1,2,3,4])
//     returns:[[4,2,3,1]
//     do_switch([7,2,3,5])
//     returns:[5,2,3,7]

public class Question_70 {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums1 = new ArrayList <Integer>();
		ArrayList <Integer> nums2 = new ArrayList <Integer>();
		
		nums1.add(1);
		nums1.add(2);
		nums1.add(3);
		nums1.add(4);

		nums2.add(7);
		nums2.add(2);
		nums2.add(3);
		nums2.add(5);
		
		System.out.println("nums1        => " + nums1);
		System.out.println("addElements  => " + do_switch(nums1));
		System.out.println();
		System.out.println("nums2        => " + nums2);
		System.out.println("addElements  => " + do_switch(nums2));

	}
	
	public static ArrayList <Integer> do_switch(ArrayList <Integer> nums){
		
		int temp = nums.get(0);
		nums.set(0, nums.get(nums.size()-1));
		nums.set(nums.size()-1, temp);

		return nums;
		
	}

}