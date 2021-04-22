package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question13_ChessBoard {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter 'W' or 'B' for the top left corner: ");
		char topLeftCorner = input.next().charAt(0);
		input.close();		
		int row=8;
		int column=8;
		
		switch (topLeftCorner) {
		case 'W':case 'w':
			for (int i=1 ; i<=column ; i++) {
				for (int j=1 ; j<=row ; j++) {
					if ((i+j)%2==0) {
						System.out.print("W ");
					}else {
						System.out.print("B ");
					}		
				}
				System.out.println();
			}
		break;
		case 'B':case 'b':
			for (int i=1 ; i<=column ; i++) {
				for (int j=1 ; j<=row ; j++) {
					if ((i+j)%2==0) {
						System.out.print("B ");
					}else {
						System.out.print("W ");
					}		
				}	
				System.out.println();
			}
		break;
		}
		
	}

}
