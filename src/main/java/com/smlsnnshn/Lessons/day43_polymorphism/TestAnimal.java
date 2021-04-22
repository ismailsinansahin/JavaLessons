package com.smlsnnshn.Lessons.day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Bird();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Bird();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(animal);

	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}
