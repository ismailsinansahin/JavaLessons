package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question07_PrintFirstHalfTwice {

	public static void main(String[] args) {
		
//		Write a program that will print out the first half of the word twice.
//		Sample Output:
//	     input: java
//	     output: jaja
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.nextLine();
		input.close();
		
		System.out.print(word + " ==> ");
		System.out.print(word.substring(0,(word.length()/2)) + word.substring(0,(word.length()/2)));

	}

}