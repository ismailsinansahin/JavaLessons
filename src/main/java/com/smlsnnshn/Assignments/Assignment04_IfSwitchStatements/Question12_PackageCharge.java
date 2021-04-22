package com.smlsnnshn.Assignments.Assignment04_IfSwitchStatements;

import java.util.Scanner;

public class Question12_PackageCharge {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your package: ");
		String packages = input.next();		
		System.out.println("Howmany hours did you use the service: ");
		int usage = input.nextInt();
		input.close();
		double charges=0;
		
		switch (packages) {
		case "A":
			if (usage>10) {
				charges = 9.95 + 2*(usage-10);
			}else {
				charges = 9.95;
			}
			System.out.println("Total charges: " + charges);
			break;
		case "B":
			if (usage>10) {
				charges = 13.95 + 1*(usage-10);
			}else {
				charges = 13.95;
			}
			System.out.println("Total charges: " + charges);
			break;
		case "C":
			charges = 19.95;
			System.out.println("Total charges: " + charges);
			break;
			
		}		

	}

}
