package com.smlsnnshn.Assignments.Assignment13;

import java.util.Scanner;

// Reverse a vowels of string without affecting any other characters. 
// Write a method reverseVowels() that will return a string with reversed vowels.
// Sample Output:
//     Input: str = "apple"
//     Output: str = "eppla"
//     Input: str = "Ab,c,de!$"
//     Output: str = "eb,c,dA!$"
//     Input : hello world
//     Output : hollo werld
// Note that only vowels were reversed.

public class Question_78 {

	public static void main(String[] args) {
		
		String vowels = "aeiou";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = input.nextLine();
		input.close();
		
		System.out.println();
		System.out.println("str                => " + str);
		System.out.println("reverseVowels(str) => " + reverseVowels(vowels, str));
	
	}
	
	public static String reverseVowels (String vowels, String str) {
		
		String newStr = "";
		String[] splittedStr = str.split("");
		String temp = "";
		
		
		for (int i=0 ; i<splittedStr.length ; i++) {
			if(vowels.contains(splittedStr[i].toLowerCase())){
				temp += splittedStr[i];			
			}
		}
		
		int j = temp.length()-1;
		for (int i=0 ; i<splittedStr.length ; i++) {
			if(vowels.contains(splittedStr[i].toLowerCase())){
				newStr += temp.charAt(j);
				j--;
			}else {
				newStr += splittedStr[i];
			}
		}

		return newStr;
		
	}	

}










