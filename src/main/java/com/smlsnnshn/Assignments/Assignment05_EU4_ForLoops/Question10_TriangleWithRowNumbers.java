package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question10_TriangleWithRowNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number: ");
		int row=input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int j=1 ; j<=i ; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}

	}

}
