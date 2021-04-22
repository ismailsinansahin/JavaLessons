package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class Student extends Person{

	@Override
	public void message() {
		System.out.println("This is a Student Class");
	}
	
	public void display() {
		message();
		super.message();
	}

}
