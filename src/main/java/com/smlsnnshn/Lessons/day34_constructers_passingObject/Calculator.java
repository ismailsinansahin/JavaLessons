package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class Calculator {
	
	Floor floor;
	Carpet carpet;
	
	public Calculator(Floor floor, Carpet carpet) {
		
		this.floor = floor;
		this.carpet = carpet;
		
	}
	
	public double getTotalCost() {
		
		return floor.getArea() * carpet.getCost();
		
	}

}
