package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question29_PrintTheFirstLimitedPartOfAString {

	public static void main(String[] args) {
		
//	This method gets a string and an int, it returns a string. 
//	What it does is to limit the inputted string to a creating number of characters.
//	Sample Output:
//	     limit("abcd",2)
//	     returns "ab"
//	     limit("bla bla",3)
//	     returns "bla"

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		String text = input.nextLine();
		System.out.println("Please enter the number of limit : ");
		int number = input.nextInt();
		input.close();
		
		System.out.println("Output : " + limit(text, number));		

	}
		
	public static String limit(String text, int number) {
		
		text = text.substring(0,number);
		return text;
		
	}
	
}