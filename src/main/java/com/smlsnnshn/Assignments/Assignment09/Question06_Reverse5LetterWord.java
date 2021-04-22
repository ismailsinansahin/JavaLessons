package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question06_Reverse5LetterWord {

	public static void main(String[] args) {
		
//		Write a program that will reverse a string. 
//		Your program should reverse a string only 5 characters long. 
//		If the word is shorter, display message: "Too short!". 
//		If the word is longer, display the message: "Too long!". 
//		Otherwise, reverse this word and print out the result into the console.
//
//		Sample Output:
//
//		     input: cat
//		     output: Too short!
//
//		     input: singularity
//		     output: Too long!
//
//		     input: apple
//		     output: elppa
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.nextLine();
		input.close();
		
		System.out.print(word + " ==> ");		
		if (word.length()>5) {
			System.out.println("Too long!");
		}else if(word.length()<5){
			System.out.println("Too short!");
		}else {
			for (int i=word.length()-1; i>=0 ; i--) {
				System.out.print(word.charAt(i));

			}
		}

	}

}