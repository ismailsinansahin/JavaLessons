package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Car_objects {

	public static void main(String[] args) {
	
		Car car1  = new Car();
		
		car1.print_car_info();
		
		car1.make="Honda";
		car1.model="CRV";
		car1.color="White";
		car1.speed=100;
		
		car1.print_car_info();
		
		car1.show_current_speed(55);
		car1.drive();
		
		System.out.println("before acceleration " + car1.speed);
		car1.acceleration(55);
		System.out.println("after acceleration " + car1.speed);
		
	}

}
