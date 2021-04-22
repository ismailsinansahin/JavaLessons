package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question13_ServiceFees {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of the checks you have written: ");
		int number_of_checks = input.nextInt();
		input.close();
		double check_fees = 10;
		
		if (number_of_checks<20) {
			check_fees+=number_of_checks*0.10;
			System.out.println("Bank's service fees for the month: " + check_fees);
		}else if (number_of_checks>=20 && number_of_checks<=39){
			check_fees+=number_of_checks*0.08;
			System.out.println("Bank's service fees for the month: " + check_fees);
		}else if (number_of_checks>=40 && number_of_checks<=59){
			check_fees+=number_of_checks*0.06;
			System.out.println("Bank's service fees for the month: " + check_fees);
		}else if (number_of_checks>=60){
				check_fees+=number_of_checks*0.04;
				System.out.println("Bank's service fees for the month: " + check_fees);
		}

	}

}
