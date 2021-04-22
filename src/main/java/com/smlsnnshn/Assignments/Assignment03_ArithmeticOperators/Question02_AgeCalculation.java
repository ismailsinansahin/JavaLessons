package com.smlsnnshn.Assignments.Assignment03_ArithmeticOperators;

public class Question02_AgeCalculation {
	
	/*
	 * Write a program - > Declare variables for your name and birth year, and the program will display:
	 * "Hello, Ozzy! Based on your input, your age is 15 :) "
	 */

	public static void main(String[] args) {

		String name = "Ozzy";
		int current_year = 2020;
		int birth_year = 1981;
		int age = current_year - birth_year;
		System.out.println("\"Hello, " + name + "! " + "Based on your input, your age is " + age + " :)\"");
		
	} 

}
