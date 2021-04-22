package com.smlsnnshn.Assignments.Assignment06_ForLoops;

import java.util.Scanner;

public class Question04_SumToTheUpperBound {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the upper bound: ");
		int upper_bound = input.nextInt();
		input.close();
		
		int total=0;
		int i=0;
		
		while (i<=upper_bound) {
			total+=i;
			i++;
		}
		
		System.out.println("Total:" + total);
		
	}

}
