package com.smlsnnshn.Lessons.day41_abstraction;

public class Eagle extends Bird {
	
	public Eagle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void eat() {
//		System.out.println("Eagle is eating");	
//	}

	@Override
	public void breathe() {
		System.out.println("Eagle is breathing");	
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying");
		
	}
		
}
