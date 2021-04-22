package com.smlsnnshn.Lessons.day38_39_inheritance_part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		
//		obj.num = 5;    // Because num is static, it is better to call it with class name
		StaticSuper.num = 5;
		obj.print();
		
		StaticSuper.num = 10;
		obj.print();
		
//		obj.m1();	    // Because m1() is static, it is better to call it with class name
		obj.m2();
		StaticSub.m1();
//		StaticSub.m2(); // Because m2() is not static, we can not call it with class name

	}

}
