package com.smlsnnshn.Lessons.day18_user_input;

import java.util.Scanner;

public class User_input_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		
		input.nextLine(); // After using any next, before nextLine you should use it
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);
		
		input.close();
		
	}

}
