package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question31_Palindrome {

	public static void main(String[] args) {
		
//	Palindrome is a word, phrase, or sequence that reads the same backward as forward, 
//	e.g., madam or nurses run.
//	So method isPalindrome checks that and returns true 
//	if check is palindrome and false if it is not.
//	- make your conditions case insensitive. ex: Civic and civic are both palindromes
//	- make your conditions space insensitive. Race car is a palindrome even though 
//	there is space in between.
//	Sample Output:
//	     isPalindrome("Noon") ==> true
//	     isPalindrome("I am not palindrome") ==> false
//	     isPalindrome("wooden") ==> false
//	     isPalindrome("Nurses Run") ==> true
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the main string : ");
		String text = input.nextLine();
		input.close();
		
		System.out.println("Output : " + isPalindrome(text.replaceAll(" ","")));

	}
		
	public static boolean isPalindrome(String text) {
		
		String reversed = "";
		
		for (int i=text.length()-1 ; i>=0 ; i--) {			
			reversed = reversed+(text.charAt(i));
		}
		
		if (reversed.equals(text)) {
			return true;
		}else {
			return false;
		}
	
	}
	
}








