package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question30_InserTheStringToThe3rdChar {

	public static void main(String[] args) {
		
//	at3 method gets two strings and returns a string. 
//	The first string is the one that will be manipulated. 
//	At the 3rd char position of the target you will insert the word argument.
//	Sample output:
//	     at3("longword","foo")
//	     return: "lonfoogword"
//	     at3("blabla","a")
//	     return: "blaabla"
		
		String text = "";
		Scanner input = new Scanner(System.in);
		
		while(text.length()<3) {
			System.out.println("Please enter minimum 3 characters of string : ");
			text = input.nextLine();
		}
		System.out.println("Please enter the part to be inserted        : ");
		String argument = input.next();
		input.close();
		
		System.out.println("Output : " + insert(text, argument));		

	}
		
	public static String insert(String text, String argument) {
		
		text = text.substring(0,3).concat(argument).concat(text.substring(3));
		return text;
		
	}
	
}
