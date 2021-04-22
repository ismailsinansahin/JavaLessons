package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question02_CompareTwoNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("num1: ");
		int num1 = input.nextInt();
		System.out.println("num2: ");
		int num2 = input.nextInt();
		input.close();

		if (num1==num2) {
			System.out.println(num1 + " and " + num2 + " are equal");
		}else if (num1>num2) {
			System.out.println(num1 + " is greater than " + num2);
		}else if (num1<num2) {
			System.out.println(num2 + " is greater than " + num1);
		}
		
	}

}
