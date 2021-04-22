package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Silly");
		
		dog.eat();
		
		dog.move(10);
		
		dog.chew();
		
//		dog.name = "ABC";  we can not do it, because there is no setter in the Animal Class
		
		System.out.println(dog.getName());

	}

}
