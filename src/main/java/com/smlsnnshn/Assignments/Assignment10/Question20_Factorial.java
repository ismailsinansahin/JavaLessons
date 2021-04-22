package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question20_Factorial {

	public static void main(String[] args) {
		
//		Calculate factorial and output result to the console.
//		Sample Output:
//		     input: 5
//		     output: 120
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = input.nextInt();
		input.close();	
		
		int result = 1;
		
		for (int i=number ; i>0 ; i--) {
			result = result*i;
		}
		System.out.println(number + "! = " + result);
		
	}

}
