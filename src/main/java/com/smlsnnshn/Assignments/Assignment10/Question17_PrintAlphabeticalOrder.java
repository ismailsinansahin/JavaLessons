package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question17_PrintAlphabeticalOrder {

	public static void main(String[] args) {
		
//		Write a program that will print out letters in the alphabetic order 
//		accordingly to the given range within 2 chars.
//
//		Sample Output:
//
//		     input: A
//		     input: Z
//		     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//		     input: a
//		     input: f
//		     output: abcdef
//
//		     input: a
//		     input: d
//		     output: abcd
//
//		     input: B
//		     input: O
//		     output: BCDEFGHIJKLMNO
				
		String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetLower = "abcdefghıjklmnopqrstuvwxyz";
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter first letter : ");
		String firstLetter = input.next();
		System.out.println("Enter second letter: ");
		String secondLetter = input.next();		
		input.close();
		
		if (alphabetUpper.indexOf(firstLetter) != -1) {
			System.out.println(alphabetUpper.substring(alphabetUpper.indexOf(firstLetter), alphabetUpper.indexOf(secondLetter)+1));			
		}else {
			System.out.println(alphabetLower.substring(alphabetLower.indexOf(firstLetter), alphabetLower.indexOf(secondLetter)+1));			
			
		}

	}

}











