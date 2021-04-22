package com.smlsnnshn.Lessons.day03_arithmeticOperators;

public class Task16_CirclePerimeterAndArea {

	public static void main(String[] args) {

		final double PI = 3.14;
		double radius = 5.5;
		double perimeter = 2*radius*PI;
		double area = radius * radius * PI;
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area     : " + area);
		
	}

}
