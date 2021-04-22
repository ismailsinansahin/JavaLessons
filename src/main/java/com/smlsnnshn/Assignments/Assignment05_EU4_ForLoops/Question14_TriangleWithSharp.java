package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question14_TriangleWithSharp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the row number: ");
		int row = input.nextInt();
		input.close();		

		for (int i=row-1 ; ((i<=row-1)&&(i>=0)) ; i--) {
			System.out.print("#");
			for (int j=i+1 ; j<=row-1 ; j++) {
				System.out.print(" ");
			}
			System.out.println("#");
		}
		
	}

}
