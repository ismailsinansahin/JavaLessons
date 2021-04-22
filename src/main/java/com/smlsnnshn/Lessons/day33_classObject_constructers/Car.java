package com.smlsnnshn.Lessons.day33_classObject_constructers;

public class Car {
	
	String model;
	String make;
	int year;
	double mile;
	String color;
	
	// Create constructor
	
	public Car() {
		
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color = "red";	
		
	}
	
//	public Car(String mo, String ma, int yr, int ml, String cl) {
//		
//		model = mo;
//		make = ma;
//		year = yr;
//		mile = ml;
//		color = cl;
//		
//	}
//	
//	public Car(String model, String make, int year, int mile, String color) {
//		
//		this.model = model;
//		this.make = make;
//		this.year = year;
//		this.mile = mile;
//		this.color = color;
//		
//	}

	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}

}
