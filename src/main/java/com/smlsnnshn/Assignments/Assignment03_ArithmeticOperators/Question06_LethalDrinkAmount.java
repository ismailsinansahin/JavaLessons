package com.smlsnnshn.Assignments.Assignment03_ArithmeticOperators;

public class Question06_LethalDrinkAmount {
	
	/*
	 * Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.
	 * Write a program with a variable that holds the number of milligrams of caffeine in a drink 
	 * and outputs how many drinks it takes to kill a person.
	 * Sample Output
	 * Number of milligrams in drink: 500
	 * It would take about 20 drinks for a lethal overdose
	 */

	public static void main(String[] args) {

		int overdose = 10000;
		int caffeineInDrink = 500;	
		int overdoseDrinkAmount = overdose/caffeineInDrink;
		
		System.out.println("Number of miligrams in drink: " + caffeineInDrink);
		System.out.println("It would take about " + overdoseDrinkAmount + " drinks for a lethal overdose");

						
	}

}
