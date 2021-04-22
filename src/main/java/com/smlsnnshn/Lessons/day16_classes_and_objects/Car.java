package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Car {
	
	String make;
	String model;
	int speed;
	String color;
	
	public void print_car_info() {
		
		String info= "Car make["+make+", model["+model+"],speed["+speed+"],color["+color+"]";		
		System.out.println(info);
		
	}
	
	public void show_current_speed(int speed_limit) {
		
		if (speed<=speed_limit) {
			System.out.println(make + " is driving at " + speed + " mph, following the speed limit - " + speed_limit);
		}else {
			System.out.println(make + " is driving at " + speed + " mph, over the speed limit - " + speed_limit);
		}
		
	}
		
	public void drive() {
		
		System.out.println(make + " " + model + " is driving");
		
	}
		
	public void acceleration(int mph) {
		
		speed = speed+mph;
		
	}	

}
