package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Dog_objects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();		
		Dog dog2 = new Dog();		
		Dog dog3 = new Dog();		

		dog1.breed="Maltese";
		dog1.age = 10;
		dog1.color="Red";
		dog1.name="Rover";
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.eating();
		dog1.sleeping();

		System.out.println(dog2.age);
		System.out.println(dog3.age);
		
	}

}
