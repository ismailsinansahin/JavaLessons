package com.smlsnnshn.Lessons.day04_unary_assignment_relationalOperators;

public class MixedIntegerOperations {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 10;
		int i3 = 126; 
		int i4 = 1;
		float f1 = 15.5f;
		double d1 = 20.5;
		short s1=10;
		short s2=20;
		byte b1=20;
		byte b2=2;
		
		int res1 = i1 + i2;				//int = int + int
		
		float res2 = i1 + f1;			//float/double = int + float
		double res3 = i2 + d1;			//double = int + double
			
		int res4 = s1 + s2;				//int = short + short
		short res5 = (short)(s1 + s2);	//short = short + short
		
		byte res6 =(byte)(b1*b2);		//byte = byte * byte
			
		byte res7 = (byte)(i3 + i4); 	//byte = (byte) int + int
		byte res8 = 126 + 1;  			//No casting is required, because compiler knows that number 
		
		System.out.println("res1: " + res1);
		System.out.println("res2: " + res2);
		System.out.println("res3: " + res3);
		System.out.println("res4: " + res4);
		System.out.println("res5: " + res5);
		System.out.println("res6: " + res6);
		System.out.println("res7: " + res7);
		System.out.println("res8: " + res8);
		
	}

}
