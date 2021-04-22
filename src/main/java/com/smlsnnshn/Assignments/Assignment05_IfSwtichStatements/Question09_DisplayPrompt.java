package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question09_DisplayPrompt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number please: ");
		String number = input.next(); 
		input.close();
		
		for (int i=0;i<number.length();i++){
			System.out.println("Display Prompt: " + number.charAt(i));		
		}		

	}

}
