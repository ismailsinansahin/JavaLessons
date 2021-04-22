package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_01 {

	public static void main(String[] args) {
	
		//Option-1
		int[] num;
		num = new int[3];
		System.out.println(num);
		
		//Option-2
		int[] numbers = new int[4];
		float[] temp = new float[100];
		long[] units = new long[50];
		char[] letters = new char[40];
		String[] words = new String[5];
		boolean[] flag = new boolean[24];
		
		System.out.println(numbers[2]); 	// default value for integer is 0
		System.out.println(temp[40]);		// default value for float is 0.0
		System.out.println(units[10]);		// default value for long is 0
		System.out.println(letters[4]);		// default value for char is nothing
		System.out.println(words[4]);		// default value for String is null
		System.out.println(flag[4]);		// default value for boolean is false
		
		int[] scores = new int[5];
		
		scores[0] = 80;
		scores[1] = 85;
		scores[2] = 90;
		scores[3] = 100;
		scores[4] = 50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int averageScore = ((scores[0] + scores[1] + scores[3] + scores[4]) / 5);
		System.out.println(averageScore);
		
	}

}
