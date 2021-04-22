package com.smlsnnshn.Lessons.day41_abstraction;

public abstract class Animal {
	
	String name;
	static int age;
	
//	public Animal() {}				   //No Argument Constructor
	
	public Animal(String name) {       //Argument Constructor
		this.name = name;
	}      
	
	public abstract void eat();        //Abstract method
		
	public abstract void breathe();
	
	public void move() {               //Instance Method
		System.out.println("Moving");
	}
	
	{
		
	}
	
	static {
		
	}
	
}
