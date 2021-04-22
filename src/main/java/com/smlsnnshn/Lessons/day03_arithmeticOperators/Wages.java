package com.smlsnnshn.Lessons.day03_arithmeticOperators;

//This program calculates hourly wages plus overtime

public class Wages {

	public static void main(String[] args) {

		double regularWage;				//the calculated regular wage
		double basePay = 25;			//the base pay
		double regularHours = 40;		//the hours worked less overtime
		double overtimeWages;			//overtime wages
		double overTimePay=37.5;		//overtime pay rate
		double overTimeHours = 10;
		double totalWage;				//total wage
		
		regularWage = basePay * regularHours;
		overtimeWages = overTimePay * overTimeHours;
		
		totalWage = regularWage + overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
	}

}
