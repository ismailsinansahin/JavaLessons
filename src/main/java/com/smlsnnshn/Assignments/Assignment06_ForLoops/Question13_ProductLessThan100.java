package com.smlsnnshn.Assignments.Assignment06_ForLoops;

import java.util.Scanner;

public class Question13_ProductLessThan100 {

	public static void main(String[] args) {
		
		int product=0;
		Scanner input = new Scanner(System.in);
		
		while (product<=100) {		
			System.out.println("Please enter a number: ");
			int num = input.nextInt();
			product = product + num*10;			
			System.out.println("product: " + product);
		}
		
		input.close();
		System.out.println("Product value is greater than 100 : " + product);
		
	}

}
