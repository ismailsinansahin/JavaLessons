package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// Given a String array words, iterate through each word and print first and 
// last letter of each element in the format below.
// Sample Output:
//   words → ["hello", "why", "by", "apple" , "note"]
//   print → [ho, wy, by, ae, ne]

public class Question_37 {

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
		
		String[] shortWords = new String[5];
		
		for (int i=0 ; i<5 ; i++) {
			shortWords[i]= Character.toString(words[i].charAt(0)) + Character.toString(words[i].charAt(words[i].length()-1));				
		}
		
		System.out.println("shortWords => " + Arrays.toString(shortWords));

	}

}










