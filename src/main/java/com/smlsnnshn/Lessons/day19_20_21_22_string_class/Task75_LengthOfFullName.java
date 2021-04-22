package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

import java.util.Scanner;

public class Task75_LengthOfFullName {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your name");
			String first_name = input.next();
			
			System.out.println("Enter your last name");
			String last_name = input.next();
			
			input.close();
			
			System.out.println("Total characters of your names:" + (first_name.length() + last_name.length()));

	}

}
