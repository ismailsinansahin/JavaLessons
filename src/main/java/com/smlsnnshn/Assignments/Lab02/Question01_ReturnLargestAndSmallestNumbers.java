package com.smlsnnshn.Assignments.Lab02;

import java.util.Scanner;

/*
 * Write a program with a loop that lets the user enter a series of integer numbers. 
 * After all the numbers have been entered, the program should display 
 * the largest and smallest numbers entered.
 */

public class Question01_ReturnLargestAndSmallestNumbers {

	static int smallestNumber, largestNumber;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int firstNumber = getFirstNumberFromTheUser();
		int nextNumber = getNextNumberFromTheUser();
		findTheSmallestAndLargest(firstNumber, nextNumber);
		
		while (theUserWantToEnterAnotherNumber()) {
			nextNumber = getNextNumberFromTheUser();
			findTheSmallestAndLargest(nextNumber);
		}
		
		displayTheLargestAndSmallestNumbers();

	}

	public static int getFirstNumberFromTheUser() {
		System.out.print("Enter your first number : ");
		int number = scanner.nextInt();
		return number;
	}
	
	public static int getNextNumberFromTheUser() {
		System.out.print("Enter your next number  :");
		int nextNumber = scanner.nextInt();
		return nextNumber;
	}
	
	private static boolean theUserWantToEnterAnotherNumber() {
		System.out.print("Do you want to enter another number: 0-No, 1-Yes ->");
		int choice = scanner.nextInt();
		if (choice == 1) {
			return true;
		}else if (choice == 0){
			return false;
		}else {
			return theUserWantToEnterAnotherNumber();
		}
	}
	
	public static void findTheSmallestAndLargest(int number1, int number2) {		
		if (number1>=number2) {
			largestNumber = number1;
			smallestNumber = number2;
		}else {
			largestNumber = number2;
			smallestNumber = number1;
		}		
	}
	
	public static void findTheSmallestAndLargest(int newNumber) {		
		if (newNumber>largestNumber) {
			largestNumber = newNumber;
		}else if (newNumber<smallestNumber) {
			smallestNumber = newNumber;
		}			
	}
	
	private static void displayTheLargestAndSmallestNumbers() {
		System.out.println("Largest Number is   : " + largestNumber);
		System.out.println("Smallest Number is  : " + smallestNumber);	
	}
	
}
