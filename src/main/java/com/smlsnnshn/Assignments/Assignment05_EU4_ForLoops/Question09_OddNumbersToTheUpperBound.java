package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

/*
 * Write a program that displays the number of even numbers between 5 and 50 (included)
 */

public class Question09_OddNumbersToTheUpperBound {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the upper bound: ");
		int upperBound=input.nextInt();
		input.close();
		
		int i=1;
		System.out.print(i);
		while (i<=upperBound) {
			if (i%2!=0 && i!=1) {
				System.out.print("," + i);
			}
			i++;	
		}

	}

}