package com.smlsnnshn.Lessons.day03_arithmeticOperators;

//This program calculates the amount of pay that will be contributed to a
//retirement plan if %5, %8, or %10 of monthly pay is witheld

public class Task12_Contribution {

	public static void main(String[] args) {

		double monthlyPay = 6000;
		double contribution;
		
		//calculate and display %5 contribution
		contribution = monthlyPay*0.05;
		System.out.println("5 percent is :" + contribution + " per month");
		
		//calculate and display %8 contribution
		contribution = monthlyPay*0.08;
		System.out.println("8 percent is :" + contribution + " per month");
		
		//calculate and display %10 contribution
		contribution = monthlyPay*0.1;
		System.out.println("10 percent is:" + contribution + " per month");
		
	}

}
