package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question01_HousePrices {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Howmany bedrooms do you want?");
		int number_of_bedrooms = input.nextInt();
		input.close();		
		int starting_price = 0;
		
		if (number_of_bedrooms==1) {
			System.out.println("One bedroom selected");
			starting_price = 1100;
			System.out.println("Starting Price: " + starting_price);
		}else if (number_of_bedrooms==2) {
			System.out.println("Two bedroom selected");
			starting_price = 1850;
			System.out.println("Starting Price: " + starting_price);
		}else if (number_of_bedrooms==3) {
			System.out.println("Three bedroom selected");
			starting_price = 2550;
			System.out.println("Starting Price: " + starting_price);
		}else {
			System.out.println("No such Bedrooms available");
		}
		
	}

}

