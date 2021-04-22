package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question02_TaxCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		System.out.println("Enter your income:");		
		int income = input.nextInt()/1000000;
		input.close();

		double tax=0;
		System.out.println("Your income is: " + income + " M");
		if (income <=150) {
			tax = (income * 0.25);
		}else if (income>150 & income<=300){
			tax = (150*0.25) + ((income-150)*0.30);			
		}else if (income>300 & income<=600) {
			tax = ((150*0.25) + (150*0.30) + ((income-300)*0.35));
		}else if (income>600 & income<=1200) {
			tax = ((150*0.25) + (150*0.30) + (300*0.35) + ((income-600)*0.40));
		}else if (income>1200) {
			tax = ((150*0.25) + (150*0.30) + (300*0.35) + (600*0.40) + ((income-1200)*0.50));
		}
		System.out.println("The tax amount you have to pay: " + tax + " M");

	}

}
