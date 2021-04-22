package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;
	
//	Given the array words, it will print the word with the largest length. 
//	Assume that there are no 2 words with longest length
//	Sample output:
//	 words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
//	 prints jaaaaavvaaaaaaaaaa

public class Question_40 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		String [] words = new String[5];
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("Please enter word " + (i+1) + " : ");
			words[i] = input.nextLine();
		}
		input.close();
		
		System.out.println();		
		System.out.println("Words   => " + Arrays.toString(words));
		System.out.println();
				
		String longest = words[0];
		
		for (int i=1 ; i<5 ; i++) {			
			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println("Longest => " +  longest);
		
	}

}



