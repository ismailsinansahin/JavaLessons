package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_03 {

	public static void main(String[] args) {
		
		String[] products = {"Timberland", "Shirt", "Watch", "Bag", "Shoes"};
		double[] prices = {120.0, 12.99, 300, 25, 67.89};
		
		for (int i=0 ; i<products.length ; i++) {
			System.out.println(products[i]);
		}
		
		for (String each : products) {
			System.out.println(each);
		}
		
		for (double each : prices) {
			System.out.println(each);
		}
		
	}

}
