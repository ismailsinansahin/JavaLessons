package com.smlsnnshn.Lessons.day35_encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the package number: ");
		RoulettePocket rp = new RoulettePocket(input.nextInt());	
		
		while(rp.getPocketColor().equalsIgnoreCase("Invalid")) {
			System.out.println("Please enter the package number: ");
			rp.setPocketNumber(input.nextInt());
		}
		
		input.close();
		System.out.println(rp.getPocketColor());
		
	}
	
}