package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class Contractor extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Contractor total pay:" + (hours * rate *1.125));
	}

}
