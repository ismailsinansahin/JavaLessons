package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given two arrays of ints sorted in increasing order, 
// outer and inner, print out true if all of the numbers 
// in inner appear in outer. Take advantage of the fact 
// that both arrays are already in sorted order.
// Sample Output:
//     input (outer): 1, 2, 4, 6
//     input (inner): 2, 4
//     output: true
//
//     input (outer): 1, 2, 4
//     input (inner): 6, 5
//     output: false

public class Question_51 {
	    		 
	public static void main(String[] args) {
		
		int [] outer1 = {1,2,4,6};
		int [] inner1 = {2,4};
		
		int [] outer2 = {1,2,4};
		int [] inner2 = {6,5};
		
		outerInner(outer1,inner1);
		outerInner(outer2,inner2);
		
	}
	
	public static void outerInner(int[] outer, int[] inner) {
		
		int counter = 0;
		boolean flag = false;
		
		for (int i=0 ; i<inner.length ; i++) {
			for (int j=0 ; j<outer.length ; j++) {
				if (inner[i] == outer[j]) {
					counter++;
					break;
				}
			}
		}
		
		if (counter==inner.length) {
			flag = true;
		}
		
		System.out.println("outer  -> " + Arrays.toString(outer));
		System.out.println("inner  -> " + Arrays.toString(inner));
		System.out.println("Output : " + flag);
		System.out.println();

	}

}
