package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Arrays;

public class Task_92 {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for (int i=0 ; i<numbers.length ; i++) {
			numbers[i] = i+1;
		}
		
		for (int i=0 ; i<numbers.length ; i++) {
			System.out.println(numbers[i]*19);
		}
		
		System.out.println(Arrays.toString(numbers));


	}

}
