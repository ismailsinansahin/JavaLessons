package com.smlsnnshn.Assignments.Assignment11;

import java.util.Scanner;

// Given a String variable sentence, write code to type 
// each word in separate lines in reverse order.
// Sample output:
//   sentence -> "Java is fun"
//   Print:
//   fun
//   is
//   Java

public class Question_34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the sentence : ");
		String sentence = input.nextLine();
		input.close();
		
		System.out.println();		
		String[] arr = sentence.split(" ");
		
		for (int i=arr.length-1 ; i>=0 ; i--) {
			System.out.println(arr[i]);
		}

	}

}
