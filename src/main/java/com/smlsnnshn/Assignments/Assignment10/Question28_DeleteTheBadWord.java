package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question28_DeleteTheBadWord {

	public static void main(String[] args) {
		
//		This method gets two strings (text and badWord) and returns a string. 
//		Basicly what it does is take out all the occurrences of badWord in text.
//		Sample Output:
//	     clean ("one two three","two")
//	     returns "one three"
//	     clean ("foo bar","foo")
//	     returns "bar"
//	     clean ("he said bla bla bla","bla")
//	     returns "he said "

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the main string : ");
		String text = input.nextLine();
		System.out.println("Please enter the part to be cleaned : ");
		String badWord = input.next();
		input.close();
		
		System.out.println("Output : " + clean(text, badWord));		

	}
		
	public static String clean(String text, String badWord) {
		
		String cleanedText = text.replaceAll(badWord,"");
		return cleanedText;
		
	}
	
}