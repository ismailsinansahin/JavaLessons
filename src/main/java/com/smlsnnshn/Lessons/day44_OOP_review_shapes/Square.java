package com.smlsnnshn.Lessons.day44_OOP_review_shapes;

public class Square extends Shape{

	public Square() {
		type = "Square";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void squareMethod() {
		System.out.println("Square Method");
	}
	

	
}
