package com.smlsnnshn.Assignments.Lab02;

import java.util.Scanner;

/*
 * Write a program that asks the user for a positive nonzero integer value. 
 * The program should use a loop to get the sum of all the integers from 1 
 * up to the number entered. 
 */

public class Question03_SumOfPositiveNumbers {
	
	public static void main(String[] args) {	
		
		int number = getThePositiveNumberFromTheUser();
		int sum = calculateSumOfTheNumbersToTheNumber(number);
		displaySumOfTheNumbersToTheNumber(number, sum);
		
	}

	public static int getThePositiveNumberFromTheUser() {	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a positive number : ");
		int number = scanner.nextInt();
		
		while (number<=0) {
			getThePositiveNumberFromTheUser();
		}
		return number;	
		
	}

	private static int calculateSumOfTheNumbersToTheNumber(int number) {
		
		int sum=0;
		
		for (int i=0 ; i<=number; i++) {
			sum += i;
		}
		
		return sum;

	}
	
	private static void displaySumOfTheNumbersToTheNumber(int number, int sum) {
		System.out.println("Sum of all the integers from 1 up to the " + number + " is: " + sum);
	}

}
