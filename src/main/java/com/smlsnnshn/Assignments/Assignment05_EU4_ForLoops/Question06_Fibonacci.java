package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question06_Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number=input.nextInt();
		input.close();
		
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a + "," + b);
		for (int i=2 ; i<number ; i++) {
			c=a+b;
			System.out.print("," + c);
			a=b;
			b=c;		
		}

	}

}
