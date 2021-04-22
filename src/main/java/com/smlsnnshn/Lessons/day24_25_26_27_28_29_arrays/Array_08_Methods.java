package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Random;

public class Array_08_Methods {

	public static void main(String[] args) {	
		printArray(100);
	}
	
	public static void printArray(int number) {		
		for (int each : createArray(number)) {
			System.out.println(each);
		}
	}
	
	public static int[] createArray(int arraySize) {		
		Random random = new Random();
		int[] myArray = new int[arraySize];
		for (int i=0 ; i<myArray.length ; i++) {
			myArray[i] = random.nextInt(100);
		}
		return myArray;		
	}

}
