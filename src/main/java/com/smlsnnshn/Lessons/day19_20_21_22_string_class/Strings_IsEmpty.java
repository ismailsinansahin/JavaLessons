package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class Strings_IsEmpty {

	public static void main(String[] args) {
		
		String username1 = "";
		String password1 = "";
		
		if (username1.isEmpty()) {
			System.out.println("Username1 field can not be empty");
		}else {
			System.out.println("Username1 is not empty");
		}
		
		if (username1.isEmpty() || password1.isEmpty()) {
			System.out.println("Username1 and password1 field can not be empty");
		}else {
			System.out.println("Username1 and password1 are not empty");
		}
		
		String username2 = "";
		
		if (username2.isBlank()) {
			System.out.println("Username2 field can not be empty");
		}else {
			System.out.println("Username2 is not empty");
		}
		
		String username3 = " ";
		
		if (username3.isBlank()) {
			System.out.println("Username3 field can not be empty");
		}else {
			System.out.println("Username3 is not empty");
		}
		

	}

}
