package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question07_PalindromeOfANumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int i = input.nextInt();
		input.close();
		palindrome(i);

	}
	
	public static void palindrome(int num) {
		
		int number = num;
		int reverse=0, remainder=0;
		
		while (number>0) {
				remainder = number%10;
				reverse = (reverse*10)+remainder;
				number = number/10;
		}
		
		if (num==reverse) {
			System.out.println("The number " + num + " is Palindrome");
		}else {
			System.out.println("The number " + num + " is not Palindrome");
		}
	
	}

}
