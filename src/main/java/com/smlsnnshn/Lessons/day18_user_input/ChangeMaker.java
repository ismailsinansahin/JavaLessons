package com.smlsnnshn.Lessons.day18_user_input;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		int attempt=0;
		
		do {			
			System.out.println("Please enter your total change: ");
			int user_amount = input.nextInt();
			
			if (user_amount>0 && user_amount<100) {
				changeMaker(user_amount);
				break;
			}else {
				attempt++;
				if (attempt==3) {
					System.out.println("Sorry! No more attempt...");
					break;
				}else {
					System.out.println("Invalid Data");
					System.out.println("Try again");
				}
			}		
		} while (true);
		input.close();
		
	}
	
	public static void changeMaker (int change) {	
		
		int quarters = change/25;
		int dimes = (change%25)/10;
		int nickles = ((change%25)%10)/5;
		int pennies = (((change%25)%10))%5;
		
		System.out.println("total=" + change);
		System.out.println(quarters + "quarters");
		System.out.println(dimes + "dimes");
		System.out.println(nickles + "nickles");
		System.out.println(pennies + "pennies");
	
	}

}
