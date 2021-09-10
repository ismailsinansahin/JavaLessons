package com.smlsnnshn.Lessons.day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal bird = new Bird();
		Bird casted1 = (Bird) new Animal();
		Dog casted2 = (Dog) new Animal();

		animal.eat();
		animal.sleep();
		dog.eat();
		dog.sleep();
		bird.eat();
		bird.sleep();
		casted1.fly();
		casted2.bark();
		casted1.fly();

	}

}

class Animal{
	public void eat(){
		System.out.println("eating...");
	}
	public void sleep(){
		System.out.println("sleeping...");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("barking...");
	}
	public void sleep(){
		System.out.println("dog sleeping...");
	}
}

class Bird extends Animal{
	public void fly(){
		System.out.println("flying...");
	}
	public void sleep(){
		System.out.println("bird sleeping...");
	}

}
