package com.smlsnnshn.Assignments.Assignment06_ForLoops;

import java.util.Scanner;

public class Question14_NumberOfEvenNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the minimum number: ");
		int min = input.nextInt();
		System.out.println("Please enter the maximum number: ");
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
