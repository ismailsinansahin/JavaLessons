package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question14_LibraryPoint {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter howmany books you have purchased this month: ");
		int books = input.nextInt();
		input.close();
		int points=0;
		
		if (books==0) {
			System.out.println("Points awarded: " + points);
		}else if (books==1) {
			points=5;
			System.out.println("Points awarded: " + points);
		}else if (books==2) {
			points=15;
			System.out.println("Points awarded: " + points);
		}else if (books==3) {
			points=30;
			System.out.println("Points awarded: " + points);
		}else if (books>=4) {
			points=60;
			System.out.println("Points awarded: " + points);
		}

	}

}
