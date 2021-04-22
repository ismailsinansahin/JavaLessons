package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Char_At {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.print(word.charAt(0));
		System.out.print(word.charAt(1));
		System.out.print(word.charAt(2));
		System.out.print(word.charAt(3));
		System.out.print(word.charAt(4));
		System.out.print(word.charAt(5));
		System.out.print(word.charAt(6));
		System.out.println(word.charAt(7));

		// Check if first and last characters are same
		
		char first = word.charAt(0);
		char last = word.charAt(word.length()-1);
		if (first==last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last doesn't match");
		}
	
	}

}
