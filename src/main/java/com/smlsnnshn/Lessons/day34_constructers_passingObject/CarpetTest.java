package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class CarpetTest {

	public static void main(String[] args) {
		
		Floor floor1 = new Floor(12,10);
		
		Carpet carpet1 = new Carpet(8);
		
		Calculator calculator1 = new Calculator(floor1, carpet1);
		
		System.out.println("Total Cost is : $" + calculator1.getTotalCost());

	}

}
