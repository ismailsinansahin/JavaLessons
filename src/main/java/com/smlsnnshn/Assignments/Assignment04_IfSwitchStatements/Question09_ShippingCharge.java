package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question09_ShippingCharge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the package weight in pounds: ");
		double package_weight = input.nextDouble();
		System.out.println("Please enter the miles your package will be shipped: ");
		int miles_shipped = input.nextInt();
		input.close();
		double shipping_charge=0;		
		
		if (package_weight<=2) {
			shipping_charge = 1.10*(miles_shipped/500);
			System.out.println("Weight of package: " + package_weight + "pounds");
			System.out.println("Shipping charge: $" + shipping_charge);
		}else if (package_weight>2 && package_weight<=6){
			shipping_charge = 2.20*(miles_shipped/500);
			System.out.println("Weight of package: " + package_weight + "pounds");
			System.out.println("Shipping charge: $" + shipping_charge);
		}else if (package_weight>6 && package_weight<=10){
			shipping_charge = 3.70*(miles_shipped/500);
			System.out.println("Weight of package: " + package_weight + "pounds");
			System.out.println("Shipping charge: $" + shipping_charge);
		}else {
			shipping_charge = 3.80*(miles_shipped/500);
			System.out.println("Weight of package: " + package_weight + "pounds");
			System.out.println("Shipping charge: $" + shipping_charge);
		}
			
	}

}
