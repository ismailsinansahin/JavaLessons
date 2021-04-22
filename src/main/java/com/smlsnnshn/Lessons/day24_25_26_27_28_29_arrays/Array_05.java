package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_05 {

	public static void main(String[] args) {
		
		int[] numbers = {5,10,15,20,50,30};		
		for (int each : numbers) {
			showValue(each);
		}
		
	}
	
	public static void showValue(int n) {
		System.out.println(n + " ");	
	}

}
