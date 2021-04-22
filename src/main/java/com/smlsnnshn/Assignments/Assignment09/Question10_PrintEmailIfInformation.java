package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question10_PrintEmailIfInformation {

	public static void main(String[] args) {
	
//		Write a program that will print out information about the user based on email. 
//		Print first and last name from the upper case.
//
//		Sample Output:
//		    Input: craig_federighi@apple.com
//		Output: 
//          First name: Craig
//          Last name: Federighi
//          Domain: apple
//          Top-Level Domain: com
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the email : ");
		String email = input.nextLine();
		input.close();
		
		String[] array1 = email.split("@");		
		String[] array2 = array1[0].split("_");	
		
		String name = array2[0].substring(0,1).toUpperCase() + array2[0].substring(1,array2[0].length());
		String surname = array2[1].substring(0,1).toUpperCase() + array2[1].substring(1,array2[1].length());
	
		String[] array3 = array1[1].split("\\.");
		
		System.out.println("First name       : " + name);
		System.out.println("Last name        : " + surname);
		System.out.println("Domain           : " + array3[0]);
		System.out.println("Top-Level Domain : " + array3[1]);

	}

}