package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question04_EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("number: ");
		int number = input.nextInt();
		input.close();

		if (number%2==0) {
			System.out.println("number = " + number);
			System.out.println(number + " is even");
		}else {
			System.out.println("number = " + number);
			System.out.println(number + " is odd");
		}	
		
	}

}
