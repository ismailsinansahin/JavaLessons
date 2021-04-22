package com.smlsnnshn.Lessons.day33_classObject_constructers;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1 = new Rectangle(2.4, 5.7); // calling constructor, new keyword invoked the constructor.
												// Question : which constructor?
												// accepting 2 arguments which are doubles
		
		System.out.println(R1.length); // who is giving me default values?
		System.out.println(R1.width);
		
//		R1.length = 5.4;
//		R1.width = 3.2;	
		
		R1.getArea();
				
		Rectangle R2 = new Rectangle(); // calling constructor, new keyword invoked the constructor.
										// Question : which constructor?
										// no arguments constructor, it means default constructor.
	
		System.out.println(R2.length);
		System.out.println(R2.width);
	
//		R2.length = 2.7;
//		R2.width = 12.5;	
		
		R2.getArea();
		
	}
	
	public static void methodA(int a, int b) {
		
	}

}
