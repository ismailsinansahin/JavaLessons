package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class FullTimeEmployee extends Employee{
	
	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Full Time Employee total pay:" + (hours * rate * 1.05));
	}

}
