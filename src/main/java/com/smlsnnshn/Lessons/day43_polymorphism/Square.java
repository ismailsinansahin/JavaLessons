package com.smlsnnshn.Lessons.day43_polymorphism;

public class Square extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Drawing the square");
	}
	
	public void look() {
		System.out.println("Looking at the square");
	}

}
