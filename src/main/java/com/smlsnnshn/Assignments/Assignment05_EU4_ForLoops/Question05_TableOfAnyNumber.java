package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

/*
 * Print the table of 12 using for loop.
 */

public class Question05_TableOfAnyNumber {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number for table: ");
		int number = input.nextInt();
		input.close();
			
		for (int i=1 ; i<=10 ; i++) {
			System.out.println(number + "X" + i + " = " + number*i);
		}
				
	}

}
