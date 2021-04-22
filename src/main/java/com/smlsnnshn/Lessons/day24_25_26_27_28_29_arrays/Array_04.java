package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_04 {

	public static void main(String[] args) {
		
		int[] array1 = {2,4,6,8};
		int[] array2 = array1;
		
		array1[0] = 200;
		array2[3] = 1000;
		
		for (int each : array1) {
			System.out.println("array1: " + each);
		}
		
		for (int each : array2) {
			System.out.println("array2: " + each);
		}
		
	}

}
