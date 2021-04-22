package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Contains {

	public static void main(String[] args) {
		
		String email = "isinansahin@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "tomatoes, potatoes, apples, oranges";
		boolean hasApples = list.contains("apples");
		System.out.println("Is list contains apples:" + hasApples);
		
		if (email.contains("@gmail")) {
			System.out.println("It is gmail account");
		}else {
			System.out.println("It is not gmail account");
		}

	}

}
