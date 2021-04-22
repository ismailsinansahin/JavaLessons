package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Given an array temps of doubles, containing temperature data, 
// compute the average temperature.  
// Sample Output:
//   input: 80 88 88 84 82 78 60 68
//   output: 78.5

public class Question_44 {
	     
	public static void main(String[] args) {
		
		double[] temps = {80,88,88,84,82,78,60,68};
		double total = 0;
		for (int i=0 ; i<temps.length ; i++) {
			total += temps[i];
		}
		
		System.out.println("Temperatures        : " + Arrays.toString(temps));
		System.out.println("Average temperature : " + total/temps.length);

	}

}
