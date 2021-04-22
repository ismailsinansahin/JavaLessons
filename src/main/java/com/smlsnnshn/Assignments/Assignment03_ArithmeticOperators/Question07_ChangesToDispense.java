package com.smlsnnshn.Assignments.Assignment03_ArithmeticOperators;

public class Question07_ChangesToDispense {
	
	/*
	 * Write a program that determines the change to be dispensed from a vending machine. 
	 * An item in the machine can cost between 25 cents and 1 dollar, 
	 * in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
	 * and the machine accepts only a single dollar bill to pay for the item.
	 * Sample output
	 * Price in cents : 95
	 * Your change is 0 quarters, 0 dimes, and 1 nickles
	 */

	public static void main(String[] args) {
		
		int priceInCents = 45;
		int changes = 100-priceInCents;
		int quarters, dimes, nickles;
		
		quarters = changes/25;
		dimes = (changes%25)/10;
		nickles = (((changes%25)%10)/5);
		
		System.out.println("Your change is " + quarters  + " quarters, " + dimes + " dimes, and " + nickles + " nickles");	
		
	}

}
