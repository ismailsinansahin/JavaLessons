package com.smlsnnshn.Lessons.day42_abstraction2_and_interface;

public class TeslaSemi extends ElectricTruck{

	private double engineSize;

	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;
	}

	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public void load(String item) {
		System.out.println("TeslaSemi - load " + item + " by lowering the truck and opening the door.");	
	}

	@Override
	public void start() {
		System.out.println("TeslaSemi - starst truck by pressing button.");
	}

	@Override
	public void charge() {
		System.out.println("TeslaSemi - plugin charge for 30 min");	
	}

	@Override
	public void drive() {
		System.out.println("TeslaSemi - truck is driving with load.");		
	}

}