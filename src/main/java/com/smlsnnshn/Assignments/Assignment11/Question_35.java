package com.smlsnnshn.Assignments.Assignment11;

import java.util.Scanner;

// Given a String variable sentence, write code to get each word 
// and assign it to String reversed in reverse order.
// Sample output:
//   sentence -> "Java is fun"
//   reversed -> "fun is Java"

public class Question_35 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter the sentence : ");
		String sentence = input.nextLine();
		input.close();
		
		System.out.println();		
		String[] arr = sentence.split(" ");
		
		System.out.print("Reversed ==> ");
		for (int i=arr.length-1 ; i>=0 ; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
