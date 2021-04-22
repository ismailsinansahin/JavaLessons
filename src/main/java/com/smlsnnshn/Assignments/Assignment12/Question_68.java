package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Method addElements accepts 2 int arrays and adds each element 
// value of two arrays and returns a new array. You can assume that 
// each array has 5 elements
// addElements(new int[][10, 40, 50, 3, 1],
// new int[][11, 0, 500, 44, 1101]);
// --------
// return array after adding values in the arrays:
// [21, 40, 550, 47, 1102]

public class Question_68 {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums1 = new ArrayList <Integer>();
		ArrayList <Integer> nums2 = new ArrayList <Integer>();
		
		nums1.add(10);
		nums1.add(40);
		nums1.add(50);
		nums1.add(3);
		nums1.add(1);
		nums2.add(11);
		nums2.add(0);
		nums2.add(500);
		nums2.add(44);
		nums2.add(1101);
		
		System.out.println("nums1        => " + nums1);
		System.out.println("nums2        => " + nums2);
		System.out.println("addElements  => " + addElements(nums1, nums2));

	}
	
	public static ArrayList <Integer> addElements(ArrayList <Integer> nums1, ArrayList <Integer> nums2){
		
		ArrayList <Integer> totalArray = new ArrayList <Integer>();
		
		for (int i=0 ; i<nums1.size() ; i++) {
			totalArray.add(i, (nums1.get(i) + nums2.get(i)));
		}

		return totalArray;
		
	}

}
