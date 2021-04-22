package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// Given a String array words, iterate through each word and print 
// the first and the last letter of each element in separate lines.
// Sample output:
//   words → ["hello", "why", "by", "apple" , "note"]
//   print: 
//   ho
//   wy
//   by
//   ae
//   ne

public class Question_33 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		String [] words = new String[5];
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("Please enter word " + (i+1) + " : ");
			words[i] = input.nextLine();
		}
		input.close();
		
		System.out.println();		
		System.out.println("Words => " + Arrays.toString(words));
		System.out.println();

		for (int i=0 ; i<5 ; i++) {
			System.out.println("Word " + i + " first and last letters : " + words[i].charAt(0) + words[i].charAt(words[i].length()-1));
		}
		
	}

}
