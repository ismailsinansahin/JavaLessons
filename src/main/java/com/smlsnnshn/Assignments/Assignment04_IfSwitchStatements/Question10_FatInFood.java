package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question10_FatInFood {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the calories in the food: ");
		int calories = input.nextInt();
		System.out.println("Please enter the fat grams in the food: ");
		int fat_grams = input.nextInt();
		input.close();
		int calories_from_fat = fat_grams*9;
		double calorie_percentage = (double)calories_from_fat/calories;

		if (calories_from_fat>calories) {			
			System.out.println("The input is invalid!");
		}else {					
			System.out.println("Percentage of the calories that come from fat: " + calorie_percentage);		
			if (calorie_percentage<0.3) {
			System.out.println("The food is low in fat.");
			}			
		}		
		
	}

}
