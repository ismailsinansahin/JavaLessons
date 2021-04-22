package com.smlsnnshn.Assignments.Assignment06_ForLoops;

import java.util.Scanner;

public class Question07_ReverseTriangleWithDescendingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number: ");
		int row=input.nextInt();
		input.close();
		
		for (int i=row ; i>0 ; i--) {
			for (int j=i+1 ; j<=row ; j++) {
				System.out.print(" ");
			}
			for (int k=i ; (k<=i)&(k>0) ; k--) {
				System.out.print(k + " ");
			}
			System.out.println("");
			System.out.println("");
		}
				
	}

}
