package com.smlsnnshn.Lessons.day43_polymorphism;

public class InstanceOf {
	
	public static void main(String[] args) {
		
		Shape sh = new Circle();
		
		if (sh instanceof Triangle) {
			System.out.println("Triangle");
		}
		else if(sh instanceof Circle) {
			System.out.println("Circle");
		}
		else if(sh instanceof Square) {
			System.out.println("Square");
		}
		
	}

}
