package com.smlsnnshn.Lessons.day33_classObject_constructers;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	// C-1
	public Mouse(int weight) {
		this(30, weight); // You are calling constructor
		this.weight = weight;
		System.out.println(1);
	}
	
	// C-2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth, 20, weight); // You are calling constructor
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println(2);
	}
	
	// C-3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println(3);
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}

}
