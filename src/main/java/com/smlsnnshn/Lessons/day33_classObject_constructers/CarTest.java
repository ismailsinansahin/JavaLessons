package com.smlsnnshn.Lessons.day33_classObject_constructers;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car(); // 1. new calls constructor
							// 2. which constructor? - with no parameter in Car Class
		
		Car c2 = new Car("Honda", "Civic", 2020, 5000, "white");
		
		Car c3 = new Car("BMW", "320", 2017, 30000, "red");
		
		System.out.println(c1.color);
		System.out.println(c2.color);
		System.out.println(c3.model);

	}

}
