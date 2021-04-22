package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		
		changeApple(a1);
		
		System.out.println(a1.color);
		
		methodObject().color = "Brown";
		
		System.out.println(a1.color);

	}
	
	public static void changeApple(Apple b1) {
		
		b1.color = "White";
		
		System.out.println(b1.color);
		
	}
	
	public static Apple methodObject() {
		
		Apple a1 = new Apple();
		
		return a1;
		
	}
	
}
