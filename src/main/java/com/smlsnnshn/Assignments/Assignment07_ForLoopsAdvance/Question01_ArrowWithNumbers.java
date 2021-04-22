package com.smlsnnshn.Assignments.Assignment07_ForLoopsAdvance;

import java.util.Scanner;

public class Question01_ArrowWithNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row number please:");
		int row=input.nextInt();
		input.close();
		
		for (int i=1 ; i<=row ; i++) {
			for (int j=1 ; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i=row-1 ; ((i<=row) && (i>0)) ; i--) {
			for (int j=1 ; (j<=i) ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();			
		}
		
	}

}
