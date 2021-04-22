package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question15_IsDogsAndCatsEqual {

	public static void main(String[] args) {
		
//	Print true if the string "cat" and "dog" appear the same number of
//	times in the given string word.
//	Sample Output:
//
//	     input: catdog
//	     output: true
//
//	     input: catcat
//	     output: false
//
//	     input: cat-cheetah-dog-cat
//	     output: false
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String string = input.nextLine().toLowerCase();
		input.close();	
		
		int catCounter = 0;
		int dogCounter = 0;
		String catString = string;
		String dogString = string;
		
		while (catString.contains("cat")) {
			catString = catString.substring(catString.indexOf("cat")+3);
			catCounter++;	
		}

		while (dogString.contains("dog")) {
			dogString = dogString.substring(dogString.indexOf("dog")+3);
			dogCounter++;	
		}	
		
		if (catCounter==dogCounter) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
