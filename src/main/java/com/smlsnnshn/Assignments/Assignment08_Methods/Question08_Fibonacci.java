package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question08_Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int i = input.nextInt();
		input.close();
		fib(i);

	}
	
	public static void fib(int num) {
	
		int num1=0;
		int num2=1;
		int number = 1;
		
		if (num == 1) {
			System.out.println("Output: " + num1);
		}else if (num == 2) {
			System.out.println("Output: " + num2);
		}else {
			for (int a=1 ; a<=num-3 ; a++) {			
				num1 = num2;
				num2 = number;
				number = num1+ num2;
			}	
		}
		
		System.out.println(number);
	
	}		

}
