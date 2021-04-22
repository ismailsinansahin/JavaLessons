package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question04_PhoneBill {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of call please: ");
		int calls = input.nextInt();
		input.close();
		double bill=0;
		System.out.println("Your call number: " + calls);
		
		if (calls<=100)  {
			bill = 200;
			System.out.println("Your bill: " + bill);
		}else if (calls>100 & calls<=150) {
			bill = (200 + (calls-100)*0.60);
			System.out.println("Your bill: " + bill);
		}else if (calls>150 & calls<=200) {
			bill = (200 + (50*0.60) + ((calls-150)*0.50));
			System.out.println("Your bill: " + bill);
		}else if (calls>200) {
			bill = (200 + (50*0.60) + (50*0.50) + ((calls-200)*0.40));
			System.out.println("Your bill: " + bill);
		}
		
	}
	
}
