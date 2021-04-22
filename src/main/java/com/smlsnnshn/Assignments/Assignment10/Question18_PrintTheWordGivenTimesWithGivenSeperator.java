package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question18_PrintTheWordGivenTimesWithGivenSeperator {

	public static void main(String[] args) {
		
//	Given two strings, word and a separator sep, return a big string made of 
//	count occurrences of the word, separated by the separator string.
//
//			Sample Output:
//
//			     input: Word
//			     input: X
//			     input: 3
//			     output: WordXWordXWord
//
//			     input: This
//			     input: And
//			     input: 2
//			     output: ThisAndThis
//
//			     input: This
//			     input: And
//			     input: 1
//			     output: This
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.next();
		System.out.println("Please enter the seperator : ");
		String sep = input.next();
		System.out.println("Howmany times do you want to write the word : ");
		int number = input.nextInt();
		input.close();
		System.out.println();
		
		System.out.print("Output: ");
		for (int i=0 ; i<number ; i++) {
			if(i>0) {
				System.out.print(sep);
			}
			System.out.print(word);
		}	

	}

}
