package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question09_SwapMailNamesWithUnderscore {

	public static void main(String[] args) {
		
//		In this task, you need to swap the first name with the last name in the email. 
//		If the email doesn't contain underscore - do not anything.
//
//		Sample Output:
//		     input: mike_tyson@gmail.com
//		     output: tyson_mike@gmail.com
//
//		     input: barakobama@gmail.com
//		     output: barakobama@gmail.com
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the email : ");
		String email = input.nextLine();
		input.close();
		
		if (email.contains("_")) {
			String[] array1 = email.split("@");
			String[] array2 = array1[0].split("_");
			System.out.println(array2[1] + "_" + array2[0] + "@" + array1[1]);
		}

	}

}