package com.smlsnnshn.Lessons.day02_dataTypes_variables;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//Declaration
		
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;

		//Assignment
		
		inches = 5;
		speed = 200;
		month = 2;
		salesCommision = 5.6f;
		distance = 40.2;
		
		System.out.println("inches: " + inches);
		System.out.println("speed: " + speed);
		System.out.println("month: " + month);
		System.out.println("salesCommision: " + salesCommision);
		System.out.println("distance: " + distance);
		System.out.println("**********************************");
		
		//Declaration + Assignment
		
		byte age = 5;
		int year = 2020;
		short mission = 16;
		float temperature = 36.4f;
		double length = 234.345;
		
		System.out.println("age: " + age);
		System.out.println("year: " + year);
		System.out.println("mission: " + mission);
		System.out.println("temperature: " + temperature);
		System.out.println("length: " + length);
		System.out.println("**********************************");
		
		//Different Ways
		
		int a = 3, b = 4;
		System.out.println("a: " + a + " b: " + b);
		System.out.println("**********************************");
		
		int c = a*b;
		System.out.println("c: " + c);
		System.out.println("**********************************");
		
		int d, e, f;
		d = 1;
		e = 2;
		f = d+e;
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("**********************************");
		
		int h, i, j = 4;
		//System.out.println("h: " + h); //h has not value
		//System.out.println("i: " + i); //i has not value
		System.out.println("j: " + j);   //j has value
		h = 5;
		i = 6;
		System.out.println("h: " + h); //h has value now
		System.out.println("i: " + i); //i has value now
		
		int k = 44; String l = "letter";
		System.out.println("k: " + k);
		System.out.println("l: " + l);
		
	}

}
