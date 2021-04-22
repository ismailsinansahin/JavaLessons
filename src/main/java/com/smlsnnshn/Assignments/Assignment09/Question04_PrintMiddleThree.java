package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question04_PrintMiddleThree {

	public static void main(String[] args) {
		
//		You have a word, do the following:
//		If the word has odd number of characters and has 5 or more characters, 
//		print the middle three characters of the word. Otherwise, print "invalid".
//		Sample Output:
//
//	       fifteen ==> fte
//	       apple ==> ppl
//	       hey ==> invalid
//	       java ==> invalid
//	       whatsup ==> ats
//	       $ ==> invalid
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.nextLine();
		input.close();
		
		if (word.length()%2!=0 && word.length()>=5) {
			System.out.print(word + " ==> " + word.substring(word.length()/2-1,word.length()/2+2));
		}else {
			System.out.println("Invalid input");
		}

	}

}