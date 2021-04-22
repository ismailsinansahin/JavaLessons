package com.smlsnnshn.Lessons.day41_abstraction;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating dog food");
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing");
		
	}
	
}
