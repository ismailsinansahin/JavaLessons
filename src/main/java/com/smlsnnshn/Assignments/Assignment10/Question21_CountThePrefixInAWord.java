package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question21_CountThePrefixInAWord {

	public static void main(String[] args) {
		
//		Given a string, consider the prefix string made of the first n chars of the string. 
//		Does that prefix string appear somewhere else in the string?
//		Assume that the string is not empty and that n is in the range from 1 till str.length().
//
//		Sample Output:
//
//		     input: abXYabc
//		     input: 1
//		     output: true
//		     a appears twice
//
//		     input: abXYabc
//		     input: 2
//		     output: true
//		     ab appears twice
//
//		     input: abXYabc
//		     input: 3
//		     output: false
//		     abX appears once only
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the word   : ");
		String word = input.nextLine();
		System.out.print("Please enter the number : ");
		int number = input.nextInt();
		input.close();	
		
		String piece = word.substring(0,number);		
		int counter = 0;
		
		while (word.contains(piece) && word.length()>=number) {		
			word = word.substring(word.indexOf(piece)+number);
			counter++;
		}
		
		if (counter > 1) {
			System.out.println("Output : True");
		}else {
			System.out.println("Output : False");
		}	
		
	}

}
