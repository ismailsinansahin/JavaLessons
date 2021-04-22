package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

import java.util.Scanner;

public class Task77_EmojiName {

	public static void main(String[] args) {

				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your emoji please: ");
		String emoji = input.nextLine();
		input.close();
		
		if (emoji.length()!=2) {
			System.out.println("Invalid emoji");
		}else {
			if (emoji.charAt(0) == ':'){
				if (emoji.charAt(1) == ')') {
					System.out.println("It is smile");
				}else if (emoji.charAt(1) == '(') {
					System.out.println("It is sad");
				}else if (emoji.charAt(1) == '/') {
					System.out.println("It is upset");
				}else if (emoji.charAt(1) == 'p') {
					System.out.println("It is playful");
				}
			}
			if (emoji.charAt(0) == ';'){
				if (emoji.charAt(1) == ')') {
					System.out.println("It is wink");
				}else if (emoji.charAt(1) == '0') {
					System.out.println("It is surprised");
				}else {
					System.out.println("Invalid entry");
				}
			}
		}
	
	}
	
}
