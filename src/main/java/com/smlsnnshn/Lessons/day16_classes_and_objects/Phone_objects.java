package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Phone_objects {

	public static void main(String[] args) {


		Phone phone1 = new Phone();
		
		System.out.println(phone1.brand);
		System.out.println(phone1.screen_size);
		
		phone1.brand="Apple";
		phone1.color="pink";
		phone1.screen_size=6;
		phone1.price=3534.50;
		
		System.out.println(phone1.brand);
		System.out.println(phone1.screen_size);
		System.out.println(phone1.color);
		System.out.println(phone1.price);
		
		Phone phone2 = new Phone();
		
		phone2.brand="Samsung";
		phone2.color="black";
		phone2.screen_size=6.6;
		phone2.price=2346.50;
		
		System.out.println("Brand: " + phone2.brand);
		System.out.println("Color: " + phone2.screen_size);
		System.out.println("Screen Size: " + phone2.color);
		System.out.println("Price: " + phone2.price);

	}

}
