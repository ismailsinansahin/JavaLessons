package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question12_PrintWithoutX {

	public static void main(String[] args) {
		
//		Given a string word, if the first or last chars are 'x' or 'X', 
//		print the string without those 'x' or 'X' chars, 
//		otherwise print the string unchanged.
//
//		Sample output:
//
//		     input: xHiX
//		     output: Hi
//
//		     input: apple
//		     output: apple
//
//		     input: xUxL
//		     output: UxL
//
//		     input: JavaX
//		     output: Java
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		String word = input.nextLine();
		input.close();
		
		if (word.charAt(0)=='x' || word.charAt(0)=='X') {
			word = word.substring(1);		
		}
		if(word.charAt(word.length()-1)=='x' || word.charAt(word.length()-1)=='X') {
			word = word.substring(0,word.length()-1);
		}
		System.out.println(word);

	}

}






