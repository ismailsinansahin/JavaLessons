package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// The code provided in your main method will take in five Strings and save them into an 
// array called arr. Print out the first three letters of each element of arr, one per line. 
// You can assume that every element of arr is at least 3 letters long.
// Sample Output:
//   arr -> ["apple", "banana"] 
//   prints: app
//   ban

public class Question_32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		String [] fruits = new String[5];
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("Please enter fruit " + (i+1) + " : ");
			fruits[i] = input.nextLine();
		}
		input.close();
		
		System.out.println();		
		System.out.println("Fruits => " + Arrays.toString(fruits));
		System.out.println();

		for (int i=0 ; i<5 ; i++) {
			System.out.println("Fruit " + i + " short name : " + fruits[i].substring(0,3));
		}
		
	}

}










