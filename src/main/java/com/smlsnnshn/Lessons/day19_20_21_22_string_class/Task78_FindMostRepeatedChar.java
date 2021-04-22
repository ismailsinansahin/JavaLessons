package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

import java.util.Scanner;

public class Task78_FindMostRepeatedChar {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string please: ");
		String str = input.nextLine();
		input.close();
		int num=1;
		char temp = ' ';
		
		for (int i=0 ; i<=str.length()-1 ; i++) {
			for (int j=0 ; j<=str.length()-1 && i!=j ; j++) {
				if (str.charAt(i) == str.charAt(j) && temp!=str.charAt(i)) {
					temp = str.charAt(i);
					num +=1;
					System.out.println(str.charAt(i) + ":" + num);
				}
			}
		}
	
	}
	
}