package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

// Write a program that will print the shortest word in the given array str.
// Sample Output:
//  input: java, cable, red, vivid, remedy, grace
//  output: red

public class Question_45 {
	     	     
	public static void main(String[] args) {
		
		String [] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		String shortest = str[0];
		
		for (int i=1 ; i<str.length ; i++) {			
			if (str[i].length()<shortest.length()) {
				shortest = str[i];
			}	
		}
		
		System.out.println("str      : " + Arrays.toString(str));
		System.out.println("shortest : " + shortest);

	}

}
