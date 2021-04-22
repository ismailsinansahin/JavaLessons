package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question06_PrintFollowing3Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = input.nextInt();
		input.close();
		sign(num);

	}
	
	public static void sign(int i) {
		
			System.out.println((i+1) + " " + (i+2) + " " + (i+3));
	
	}

}