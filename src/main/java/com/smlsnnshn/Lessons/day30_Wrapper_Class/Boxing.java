package com.smlsnnshn.Lessons.day30_Wrapper_Class;

public class Boxing {

	public static void main(String[] args) {
		
		//Auto_Boxing --> primitive to object
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		System.out.println(num1);
		System.out.println(n);
		System.out.println(num2);
		
		//Unboxing --> object to primitive
		
//		Double d1 = new Double(34.2);
//		double d2 = d1;
//		System.out.println("d1: " + d1);
//		System.out.println("d2: " + d2);
//		
//		long l1 = new Long(6000000L);    //unboxing
//		long l2 = new Long(345699459);   //no boxing
//		long l3 = l2;                    //unboxing
//		
//		int x = 345;
//		double y = x;
//		
//		Integer num3 = Integer.valueOf(345);
		
		//Double d3 = num3;  //casting is not possible with the wrapper classes
			
	}

}
