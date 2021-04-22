package com.smlsnnshn.Lessons.day18_user_input;

import java.util.Scanner;

public class User_input_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide a sentence and i will repeat it for you: ");
		String a = input.next();        // only one word without space
		System.out.println(a);
		
		input.nextLine(); 

		System.out.println("Provide a sentence and i will repeat it for you: ");
		String b = input.nextLine(); // whole line
		System.out.println(b);
		
		
		input.close();
		
	}

}
