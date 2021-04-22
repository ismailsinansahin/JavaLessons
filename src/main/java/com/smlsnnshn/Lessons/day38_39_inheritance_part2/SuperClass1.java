package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class SuperClass1 {

	public SuperClass1() {
		System.out.println("This is the SuperClass1 default constructor");
	}
	
	public SuperClass1(int x) {
		System.out.println("This is the SuperClass1 one parameter constructor");
		System.out.println(x);
	}
	
	public SuperClass1(int x, int y) {
		System.out.println("This is the SuperClass1 two parameter constructor");
		System.out.println(x + y);
	}
	
}
