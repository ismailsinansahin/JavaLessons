package com.smlsnnshn.Lessons.day44_OOP_review_shapes;

public class Diamond extends Shape{
	
	public Diamond() {
		type = "diamond";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a diamond");
	}

}
