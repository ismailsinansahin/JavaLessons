package com.smlsnnshn.Lessons.day23_random_class;

import java.util.Random;

public class Random_Class {
	
	public static void main(String[] args) {
		
		Random rn = new Random();
				
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));
		System.out.println(rn.nextInt(100) - 50);
		
		
	}

}
