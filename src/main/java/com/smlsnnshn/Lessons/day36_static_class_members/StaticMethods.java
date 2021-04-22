package com.smlsnnshn.Lessons.day36_static_class_members;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		// show2(); // you can not call instance method/variable from static method
		show4(); // you can call static method from static method
		System.out.println(name);
		// System.out.println(age);
	}
	
	public void show2() {
		show1(); // you can call static from instance method
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {
		show2();
		show1();
	}
	
	public static void show4() {
		
	}
	
}
