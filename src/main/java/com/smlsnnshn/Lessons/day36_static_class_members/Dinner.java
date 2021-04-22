package com.smlsnnshn.Lessons.day36_static_class_members;

public class Dinner {
	
	static int pizzaSlice = 8;
	
	public void takeASlice() {
		pizzaSlice--;
	}

	public void takeASlice(int count) {
		pizzaSlice -= count;
	}
	
}
