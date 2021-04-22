package com.smlsnnshn.Lessons.day36_static_class_members;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total Slices:" + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println(Dinner.pizzaSlice);
		
		dad.takeASlice(3);
		kid.takeASlice(2);
		
		System.out.println(Dinner.pizzaSlice);

	}

}
