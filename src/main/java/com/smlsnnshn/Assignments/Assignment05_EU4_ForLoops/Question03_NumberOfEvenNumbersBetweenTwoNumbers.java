package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question03_NumberOfEvenNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the minimum number: ");
		int min = input.nextInt();
		System.out.print("Please enter the maximum number: ");
		int max = input.nextInt();
		input.close();
		int counter = 0;
		
		for (int i=min ; i<=max ; i++) {
			if (i%2!=0) {
				counter++;
			}
		}
		System.out.println("Number of even numbers between " + min + " and " + max + " : " + counter);

	}

}
