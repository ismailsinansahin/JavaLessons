package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question01_BMICalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height's feet portion then press enter.");
		int height_feets = input.nextInt();
		System.out.println("Enter your height's inches portion then press enter.");
		int height_inches = input.nextInt();
		System.out.println("Enter your weight in pounds:");
		int weight_pounds = input.nextInt();
		input.close();
		double height=((height_feets*12) + height_inches)*0.0254;
		double weight=weight_pounds*2.2;
		double BMI=weight/(height*height);

		System.out.println("Your weight in pounds: " + weight_pounds);
		System.out.println("Your height in feet followed by a space then additional inches: " + height_feets + " " + height_inches);
		System.out.println("Your BMI: " + BMI);

		if (BMI<18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if (BMI>=18.5 && BMI<25) {
			System.out.println("Your risk factory is Normal Weight");
		}else if (BMI>=25 && BMI<30) {
			System.out.println("Your risk factory is Overweight");
		}else if (BMI>30) {
			System.out.println("Your risk factory is Obese");
		}
		
	}

}
