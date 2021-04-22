package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question03_LeapYear {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year please:");
		int year = input.nextInt();
		input.close();
			
		if (year%4==0)  {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println(year + " Leap Year");
				}else {
					System.out.println(year + " NOT a Leap Year");
				}
			}else {
				System.out.println(year + " Leap Year");
			}
		}else {
			System.out.println(year + " NOT a Leap Year");
		}	
		
	}

}
