package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {
		
		Random random = new  Random();
		int[] numbers = new int[10];
		
		for (int i=0 ; i<numbers.length ; i++) {
			numbers[i] = random.nextInt(100);
		}
		
		for (int i=0 ; i<numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
