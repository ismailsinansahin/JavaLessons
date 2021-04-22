package com.smlsnnshn.Lessons.day18_user_input;

import java.util.Scanner; // "java.util.*" --> for all methods

public class User_input_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // after this line you can use input.
		
		System.out.println("Please enter a byte value : ");
		byte a = input.nextByte();
		System.out.println("Byte Value: " + a);
		
		System.out.println("Please enter a short value : ");
		short b = input.nextShort();
		System.out.println("Short Value: " + b);
		
		System.out.println("Please enter a int value : ");
		int c = input.nextInt();
		System.out.println("Int Value: " + c);
		
		System.out.println("Please enter a long value : ");
		long d = input.nextLong();
		System.out.println("Long Value: " + d);
		
		System.out.println("Please enter a double value : ");
		double e = input.nextDouble();
		System.out.println("Double Value: " + e);
		
		System.out.println("Please enter a boolean value : ");
		boolean f = input.nextBoolean();
		System.out.println("Boolean Value: " + f);

			
//		System.out.println("Please enter a byte value : ");
//		byte z = input.nextInt();
//		System.out.println(z);
//		Compile error, because you can not put an int to a byte
		
		input.close(); // after this line you can not use input again	

	}

}
