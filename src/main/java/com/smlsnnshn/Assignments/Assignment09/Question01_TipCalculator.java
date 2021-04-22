package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question01_TipCalculator {

	public static void main(String[] args) {
		
//		Create a method called tipCalculator which accepts parameters:  
//		boolean isSplit, int numberPeople, double checkAmount, String serviceQuality
//		Ask the user to enter each value. 
//		User should select service quality that will correspond to tip percent.
//		Poor = 5%
//		Fair = 10%
//		Good = 15%
//		Great = 20%
//		Excellent = 25%
//
//		The program should display the following information based on the user input: 
//		Split or No split
//		Number of people entered: &&&&
//		Service Quality: 
//		Total to pay:
//		Total tip:
//		Total per person:
//		Tip per person:
//
//		Input: 
//		Split:Yes
//		Number of people:4
//		Check amount:476.0
//		Service Quality:Excellent
//		Output:
//		Number of people entered: &&&&
//		Total to pay: 595.0
//		Total tip: 119.0
//		Total per person: 148.75
//		Tip per person: 29.75
		
		// Initial variables
		
		int checkAmount = 0;
		int numberPeople = 0;
		boolean isSplit = false;
		String serviceQuality = " ";
		int qualityNumber = 0;
		boolean flag = false;
	
		Scanner input = new Scanner(System.in);
		
		// Taking the check amount
		
		System.out.print("Please enter the check amount ......... : ");
		checkAmount = input.nextInt();	
		System.out.println();
		
		// Taking the number of people to participate to the payment
				
		System.out.print("How many people are paying the bill? .. : ");
		numberPeople = input.nextInt();
		System.out.println();
		
		// If participants > 1 isSplit is changed to true
		
		if (numberPeople > 1) {
			isSplit = true;
		}
		
		// Taking the service quality 
		
		while(flag == false) {
			
			System.out.println("Poor ..... --> 1");
			System.out.println("Fair ..... --> 2");
			System.out.println("Good ..... --> 3");
			System.out.println("Great .... --> 4");
			System.out.println("Excellent. --> 5");
			System.out.println();
			System.out.println("How was service quality today?  ");
			System.out.print("Enter 1-5 to select.................... : ");

			qualityNumber = input.nextInt();
			
			switch (qualityNumber) {
			case 1:
				serviceQuality = "Poor";
				flag = true;
				break;
			case 2:
				serviceQuality = "Fair";
				flag = true;
				break;
			case 3:
				serviceQuality = "Good";
				flag = true;
				break;
			case 4:
				serviceQuality = "Great";
				flag = true;
				break;
			case 5:
				serviceQuality = "Excellent";
				flag = true;
				break;
			default:
				break;		
			}
			
		}
		
		System.out.println();
		
		input.close();
		
		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality, qualityNumber);		

	}
	
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality, int qualityNumber) {
		
		// Printing isSplit
		
		if (isSplit) {
			System.out.println("Split ......................... : True");
		}else {
			System.out.println("Split ......................... : False");
		}
		
		// Printing number of people entered to payment with number of '&'
		
		System.out.print("Number of people entered ...... : ");
		for (int i=1 ; i<=numberPeople ; i++) {
			System.out.print("&");
		}
		System.out.println();
		
		// Printing the total payment and total tip
		
		double totalTip = 0;
		
		if (qualityNumber==1) {
			totalTip = checkAmount * 0.05;
		}else if (qualityNumber==2) {
			totalTip = checkAmount * 0.10;
		}else if (qualityNumber==3) {
			totalTip = checkAmount * 0.15;
		}else if (qualityNumber==4) {
			totalTip = checkAmount * 0.20;
		}else if (qualityNumber==5) {
			totalTip = checkAmount * 0.25;
		}

		double totalPay = checkAmount + totalTip;
		
		System.out.println("Total to pay .................. : " + totalPay);
		System.out.println("Total tip ..................... : " + totalTip);
		
		// Printing total payment and total tip per person
		
		System.out.println("Total per person .............. : " + totalPay / numberPeople);
		System.out.println("Tip per person ................ : " + totalTip / numberPeople);
		
	}

}