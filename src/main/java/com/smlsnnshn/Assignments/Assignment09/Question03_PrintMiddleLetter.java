package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question03_PrintMiddleLetter {

	public static void main(String[] args) {
		
//		You have a word, do the following:
//
//			1. When word has odd number of characters and:
//			     - 3 or more characters, print middle letter
//			              oak ==> a
//			              javav ==> v
//			     - Single character, print that character 3 times
//			             # ==> ###
//			             q ==> qqq
//
//			2. When word has even number of characters and:
//			     - 4 or more characters, print middle 2
//			            java ==> av
//			            apples ==> pl
//			            #$%^&* ==> %^
//			    - 2 characters, print those 2 characters twice
//			           @@ ==>@@@@
//			           $$ ==>$$$$
//			           hi ==> hihi
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.nextLine();
		input.close();
		
		if (word.length()==1) {
			System.out.print(word + " ==> ");
			for (int i=1 ; i<=3 ; i++) {
				System.out.print(word);
			}
		}
		
		if (word.length()==2) {
			System.out.print(word + " ==> ");
			for (int i=1 ; i<=2 ; i++) {
				System.out.print(word);
			}
		}
		
		if (word.length()%2!=0 && word.length()>=3) {
			System.out.print(word + " ==> " + word.charAt((word.length()/2)));
		}
		
		if (word.length()%2==0 && word.length()>2) {
			System.out.print(word + " ==> " + word.charAt(word.length()/2-1) + word.charAt(word.length()/2));
		}		

	}

}
