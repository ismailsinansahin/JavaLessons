package com.smlsnnshn.Assignments.Assignment14.Question_08;

public class Question_08_Test {

	public static void main(String[] args) {
		
		Value value1 = new Value();	
		System.out.println("Value value1 = new Value();   ==> " + value1.getVal());
		System.out.println("****************************************************");
		
		Value value2 = new Value(1);
		System.out.println("Value value2 = new Value(1);  ==> " + value2.getVal());
		System.out.println("****************************************************");
		
		Value value3 = new Value();
		value3.setVal(2);
		System.out.println("Value value3 = new Value();   ==> " + value3.getVal());
		System.out.println("value3.setVal(2)");

	}
	
}
