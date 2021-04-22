package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question02_Cube {

	public static void main(String[] args) {
		
		cube();

	}
	
	public static void cube() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = input.nextInt();
		int result = num*num*num;
		System.out.println("Result = " + result);
		input.close();

	}

}
