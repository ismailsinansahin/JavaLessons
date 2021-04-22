package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question05_MergeTheWords {

	public static void main(String[] args) {
		
//		You have 2 words, both of them have 3 characters. 
//		If either of them does not have exactly 3 characters, 
//		print "cannot merge" Merge their characters one by one 
//		and print together like below:
//			
//			Sample Output:
//
//			    aok
//			    lol
//			    alookl
//
//			    ear
//			    pie
//			    epaire
//
//			    java
//			    wow
//			    cannot merge
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first word : ");
		String word1 = input.nextLine();
		System.out.println("Please enter the second word : ");
		String word2 = input.nextLine();
		input.close();
		
		if (word1.length() == 3 && word2.length() == 3) {
			for (int i=0; i<=2 ; i++) {
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
			}
		}else {
			System.out.println("Can not merge");
		}

	}

}