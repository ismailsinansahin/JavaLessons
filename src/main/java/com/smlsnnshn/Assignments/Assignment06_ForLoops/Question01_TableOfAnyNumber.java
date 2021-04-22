package com.smlsnnshn.Assignments.Assignment06_ForLoops;

import java.util.Scanner;

/*
 * Print the table of 12 using for loop.
 */

public class Question01_TableOfAnyNumber {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number for table: ");
		int number = input.nextInt();
		input.close();
			
		for (int i=1 ; i<=10 ; i++) {
			System.out.println(number + "X" + i + " = " + number*i);
		}
				
	}

}
