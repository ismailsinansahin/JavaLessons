package com.smlsnnshn.Lessons.day37_inheritance_part1;

public class Person {
	
	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		System.out.println(name + " is eating " + food);
	}
	
	public void walk() {
		System.out.println(name + " is walking ");
	}
	
	public void sleep(int hours) {
		System.out.println(name + " is sleeping for " + hours + " hours");
	}

}
