package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question01_Plus {

	public static void main(String[] args) {
			
		plus();

	}
	
	public static void plus() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Please enter the first number: ");
		int num2 = input.nextInt();
		input.close();
		
		int result = num1 + num2;
		System.out.println("Result = " + result);	
		
	}

}
