package com.smlsnnshn.Assignments.Assignment05_EU4_ForLoops;

import java.util.Scanner;

public class Question02_OddNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the minimum number: ");
		int min = input.nextInt();
		System.out.print("Please enter the maximum number: ");
		int max = input.nextInt();
		input.close();
		
		for (int i=min ; i<=max ; i++) {
			if (i%2==0) {
				if (i<=min+1) {
					System.out.print(i);
				}else {
					System.out.print("," + i);	
				}	
			}
		}

	}

}
