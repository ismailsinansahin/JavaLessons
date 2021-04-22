package com.smlsnnshn.Lessons.day33_classObject_constructers;

public class Rectangle {
	
	double length;
	double width;
	
	public void getArea() {
		
		System.out.println(length * width);
		
	}
		
	// constructor ==> its mission is instantiate the object variables
	// created a constructor
	// accepts 2 arguments type double

	public Rectangle(double a, double b) {
		
		length = a;
		width = b;
		
	}
	
	public Rectangle() {
		
		length = 5.5;
		width = 4.5;
		
	}
	
//	it is default constructor, but it is not shown
//	when we create a new object, default constructor assigns the default values
	
//	public Rectangle() {
		
//	}

}
