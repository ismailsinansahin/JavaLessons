package com.smlsnnshn.Assignments.Assignment07_ForLoopsAdvance;

import java.util.Scanner;

public class Question05_SquareWith1sAndReverseNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number:");
		int row = input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int j=1 ; j<=row-i ; j++) {
				System.out.print("1");
			}
			for (int k=1 ; k<=i ; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
