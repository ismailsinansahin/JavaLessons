package com.smlsnnshn.Lessons.day36_static_class_members;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1(); // call method through only static way

		/*
		ABC o1 = new ABC(); // error
		o1.m1();
		*/
			
		//Whenever all of your methods in your class are static,
		//and you want to everyone to call them in a static way 
		//Classname.methodname(), then you can simply make your 
		//constructor private.
		
	}
	
	public static void print() {
		//static int a = 5; // local variables can not be static		
	}
	
}
