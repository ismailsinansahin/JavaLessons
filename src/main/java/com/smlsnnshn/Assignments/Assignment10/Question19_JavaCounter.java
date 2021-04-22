package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question19_JavaCounter {

	public static void main(String[] args) {
		
//	Return the number of times that the string "java" appears anywhere 
//	in the given string word.
//
//	Sample Output:
//
//	     input: javaxjava
//	     output: 2
//
//	     input: javaxjavaapplepearjavaegg
//	     output: 3
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String string = input.nextLine().toLowerCase();
		input.close();	
		
		int counter = 0;
		
		while (string.contains("java")) {
			string = string.substring(string.indexOf("java")+4);
			counter++;	
		}
		
		System.out.println("Counter : " + counter);
		
	}

}
