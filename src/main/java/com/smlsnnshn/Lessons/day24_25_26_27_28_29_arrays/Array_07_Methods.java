package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_07_Methods {
	
	public static void main(String[] args) {
		
		double[] values;
		values = getArray();
		for (double each: values) {
			System.out.println(each + " ");
		}
		
	}
	
	public static double[] getArray() {
		double[] array = {1.2,2.3,4.4,5.6};
		return array;
 	}

}
