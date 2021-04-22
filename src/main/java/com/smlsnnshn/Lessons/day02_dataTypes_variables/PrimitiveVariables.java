package com.smlsnnshn.Lessons.day02_dataTypes_variables;

public class PrimitiveVariables {
	
	public static void main(String[] args) {
		
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128; //it is out of byte limit
		
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
		System.out.println("**************************************");
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		System.out.println("*************************************");
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("i4: " + i4);
		System.out.println("**************************************");
		
		long l1 = 5000; //suffix "l" or "L" is optional
		long l2 = -213324432342L; // suffix "l" or "L" is mandatory, this number is out of int range
		long l3 = 2345634652342l; // suffix "l" or "L" is mandatory, this number is out of int range
		
		long creditCardNumber = 5876_1234_3453_9832L;
		
		System.out.println("l1: " + l1);
		System.out.println("l2: " + l2);
		System.out.println("l3: " + l3);
		System.out.println("creditCardNumber: " + creditCardNumber);
		System.out.println("**************************************");
		
		float f1 = 2.1f; //Since default floating number data type is double, we have to add "f" or "F"
		float f2 = 2.3F;
		double d1 = 3.234;
		
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("d1: " + d1);
		System.out.println("**************************************");

		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = 8658;
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("**************************************");
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);	
		System.out.println("**************************************");
		
		String name = "Sinan";
		String age = "40";
		System.out.println("My name is " + name + ". I am " + age + " years old.");
		
	}

}
