package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question05_MagicDate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter the month in numeric form please: ");
		int month = input.nextInt();
		System.out.println("Enter the day of month please: ");
		int day = input.nextInt();		
		System.out.println("Enter the year in two digit please: ");
		int year = input.nextInt();		
		input.close();	
		System.out.println("Your date is " + month + "/" + day + "/" + year);				
		if (month*day==year) {
			System.out.println("The date is magic!");
		}else {
			System.out.println(("The date is not magic."));
		}
	
	}
	
}
