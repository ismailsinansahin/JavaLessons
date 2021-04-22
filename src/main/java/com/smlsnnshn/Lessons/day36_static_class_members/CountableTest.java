package com.smlsnnshn.Lessons.day36_static_class_members;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable();  //1
		Countable obj2 = new Countable();  //1
		Countable obj3 = new Countable();  //1
		
		objectCount = obj1.getInstancCount();  //1
		objectCount = obj2.getInstancCount();  //1
		objectCount = obj3.getInstancCount();  //1
		
		System.out.println(objectCount);
		
	}

}
