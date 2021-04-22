package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

import java.util.Scanner;

public class Task76_NameWithBlanks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string please: ");
		String word = input.nextLine();
		input.close();
		
		for (int i=0 ; i<=word.length()-1 ; i++) {
			System.out.print(word.charAt(i) + " ");
		}

	}

}
