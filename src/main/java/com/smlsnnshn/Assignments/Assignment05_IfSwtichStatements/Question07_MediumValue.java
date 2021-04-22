package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question07_MediumValue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("num1: ");
		int num1 = input.nextInt();
		System.out.println("num2: ");
		int num2 = input.nextInt();
		System.out.println("num3: ");
		int num3 = input.nextInt();
		input.close();
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);

		if ((num1>num2) && (num1>num3)) {
			if (num2>num3) {
				System.out.println("Medium value is: " + num2);
			}else {
				System.out.println("Medium value is: " + num3);
			}
		}else if ((num2>num1) && (num2>num3)) {
			if (num1>num3) {
				System.out.println("Medium value is: " + num1);
			}else {
				System.out.println("Medium value is: " + num3);
			}
		}else if ((num3>num1) && (num3>num2)) {
			if (num1>num2) {
				System.out.println("Medium value is: " + num1);
			}else {
				System.out.println("Medium value is: " + num2);	
			}
		}else if ((num1==num2) || (num1==num3) || (num2==num3)){
			System.out.println("Because of there is an equation between numbers, there is no medium value between them!");
		}
			
	}

}
