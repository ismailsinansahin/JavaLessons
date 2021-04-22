package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question08_PackagePurchase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of packages you will purchase: ");
		int packages = input.nextInt();
		input.close();
		double amount=99*packages;
		double discount=0;
		
		if (packages>=10 && packages<=19) {
			discount = amount*0.20;
			amount = amount-discount;
			System.out.println("The purchase is  : " + amount);
			System.out.println("Your discount is : " + discount);
		}else if (packages>=20 && packages<=49) {
			discount = amount*0.30;
			amount = amount-discount;
			System.out.println("The purchase is  : " + amount);
			System.out.println("Your discount is : " + discount);	
		}else if (packages>=50 && packages<=99) {
			discount = amount*0.40;
			amount = amount-discount;
			System.out.println("The purchase is  : " + amount);
			System.out.println("Your discount is : " + discount);
		}else if (packages>=100) {
			discount = amount*0.50;
			amount = amount-discount;
			System.out.println("The purchase is  : " + amount);
			System.out.println("Your discount is : " + discount);
		}else {
			System.out.println("The purchase is: " + amount);
			System.out.println("There is no discount for the packages below 10");
		}		

	}

}
