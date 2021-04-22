package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Arrays;

public class Array_15_Ragged_Array {

	public static void main(String[] args) {
	
		int[][] array = new int[4][];
		
		System.out.println(array[0]);
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
		
		int[][] array2 = { {0,0,0} , {0,0,0,0} , {0,0,0,0,0} , {0,0} } ;
		System.out.println(Arrays.toString(array2));
	

	}

}