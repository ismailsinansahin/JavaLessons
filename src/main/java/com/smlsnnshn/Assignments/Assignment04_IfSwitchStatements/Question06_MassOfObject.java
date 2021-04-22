package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question06_MassOfObject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mass of object: ");
		double mass = input.nextDouble();
		input.close();
		double weight = mass*9.8;
		System.out.println("Object mass is  : " + mass + " kilogram");
		System.out.println("Object weight is: " + weight + " Newton");
		
		if (weight > 1000) {
			System.out.println("It is too heavy!");
		}else if (weight < 10) {
			System.out.println("It is too light!");
		}else {
			System.out.println("It is normal...");
		}
		
	}

}
