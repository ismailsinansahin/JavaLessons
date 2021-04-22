package com.smlsnnshn.Assignments.Lab02;

import java.util.Scanner;

/*
 * A bag of cookies holds 40 cookies. The calorie information on the bag 
 * claims that there are 10 serving in the bag and that a serving equals 
 * 300 calories. write a program that lets the user enter the number of 
 * cookies he or she actually ate and then reports the number of total 
 * calories consumed.
 */

public class Question02_CookiesCalories {

	public static void main(String[] args) {		
		int caloryOfOneCooky = calculateTheCaloryOfOneCooky();
		int cookiesEaten = getTheNumberOfEatenCookies();
		reportTheCaloriesConsumed(caloryOfOneCooky, cookiesEaten);		
	}

	private static int calculateTheCaloryOfOneCooky() {
		int numberOfCookiesInABag = 40;
		int servingNumberInABag = 10;
		int caloriesOfOneServing = 300;	
		return caloriesOfOneServing/(numberOfCookiesInABag/servingNumberInABag);	
	}

	private static int getTheNumberOfEatenCookies() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Howmany cookies did you eat? : ");
		int cookiesEaten = scanner.nextInt();
		scanner.close();
		return cookiesEaten;
	}
	
	private static void reportTheCaloriesConsumed(int caloryOfOneCooky, int cookiesEaten) {
		System.out.println("Calory Consumed : " + cookiesEaten*caloryOfOneCooky);	
	}
	
}
