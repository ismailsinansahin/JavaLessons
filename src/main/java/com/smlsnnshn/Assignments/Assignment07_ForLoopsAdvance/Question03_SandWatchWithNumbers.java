package com.smlsnnshn.Assignments.Assignment07_ForLoopsAdvance;

import java.util.Scanner;

public class Question03_SandWatchWithNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the row number:");
		int row = input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int k=2 ; k<=i ; k++) {
				System.out.print(" ");
			}
			for (int j=i ; j<=row ; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");				
		}
		for (int i=1 ; i<=row-1 ; i++) {
			for (int k=row-i-1 ; k>0 ; k--) {
				System.out.print(" ");
			}
			for (int j=row-i ; j<=row ; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");

		}	

	}

}
