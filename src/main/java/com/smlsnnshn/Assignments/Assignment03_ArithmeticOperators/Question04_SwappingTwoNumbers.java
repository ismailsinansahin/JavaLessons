package com.smlsnnshn.Assignments.Assignment03_ArithmeticOperators;

public class Question04_SwappingTwoNumbers {
	
	/*
	 * Declare 2 variables (Num1, Num2)
	 * Swap values between Num1 and Num2
	 * Display new values of Num1 and Num2
	 * Sample output:
	 * n1=10
	 * n2=20
	 * ---------
	 * n1=20
	 * n2=10
	 */

	public static void main(String[] args) {

		//By using third variable
		
		int n1=10;
		int n2=20;
		System.out.println("n1= " + n1);
		System.out.println("n2= " + n2);
		System.out.println("----------");	
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("n1= " + n1);
		System.out.println("n2= " + n2);
		
		System.out.println("*****************");
		
		//By using arithmetic operators
		
		int n4=40;
		int n5=50;
		System.out.println("n4= " + n4);
		System.out.println("n5= " + n5);
		System.out.println("----------");	
		n4 = n4 + n5;
		n5 = n4 - n5;
		n4 = n4 - n5;
		System.out.println("n4= " + n4);
		System.out.println("n5= " + n5);

	}

}
