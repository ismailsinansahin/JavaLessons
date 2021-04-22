package com.smlsnnshn.Lessons.day42_abstraction2_and_interface;

public abstract class ElectricTruck extends ElectricCar{
	
	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
	}

	public abstract void load(String item);

}
