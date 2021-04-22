package com.smlsnnshn.Lessons.day41_abstraction;

public abstract class Bird extends Animal{
	
	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Bird is eating");	
	}

//	@Override
//	public void breathe() {
//		System.out.println("Bird is breathing");	
//	}
	
	public abstract void fly();
	
}
