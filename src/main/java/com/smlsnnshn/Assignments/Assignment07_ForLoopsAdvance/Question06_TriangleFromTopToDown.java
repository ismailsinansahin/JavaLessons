package com.smlsnnshn.Assignments.Assignment07_ForLoopsAdvance;

import java.util.Scanner;

public class Question06_TriangleFromTopToDown {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number:");
		int row = input.nextInt();
		input.close();
		int total=0;
		
		for (int i=1 ; i<=row ; i++) {
			total = i;
			System.out.print(total + " ");
			for (int j=1 ; j<i ; j++) {
				total += (row-j);
				System.out.print(total + " ");
			}
		System.out.println();
		}
			
	}

}
