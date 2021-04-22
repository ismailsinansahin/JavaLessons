package com.smlsnnshn.Assignments.Assignment11;

import java.util.Scanner;

// Given a String variable email, write code using split method to print email id 
// and domain in separate lines.
// Sample Output:
//     email -> info@cybertekschool.com
//     Print: 
//     Email id: info
//     Email domain: cybertekschool.com
// If email contains no @ character or multiple @ characters then print invalid email:
//     email -> hello-gmail.com
//     print: 
//     invalid email
//     email -> my@fancy@email.com
//     print: 
//     invalid email

public class Question_39 {
	     
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the email : ");
		String email = input.nextLine();
		input.close();
		System.out.println();
		
		String[] arr = email.split("@");
		
		if (arr.length!=2) {
			System.out.println("Invalid email");
		}else {	
			System.out.println("Email ID     : " + arr[0]);
			System.out.println("Email Domain : " + arr[1]);
		}

	}

}














