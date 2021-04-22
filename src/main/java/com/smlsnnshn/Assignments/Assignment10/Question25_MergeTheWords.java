package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question25_MergeTheWords {

	public static void main(String[] args) {
		
//		When gears merge and work together, one tooth from each one goes in order.
//		Write a method mergeStrings that will return the strings merged, 
//		one letter at a time, starting with one. Please note one and two
//		can be of different lengths. Please look at below examples:
//	     s1 ==> "12345"
//	     s2 ==> "abcde"
//	     mergeStrings(s1,s2) ==> "1a2b3c4d5e"
//	     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
//	     mergeStrings("java", "selenium") ==> "jsaevlaenium"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first string");
		String firstString = input.nextLine();
		System.out.println("Please enter the second string");
		String secondString = input.nextLine();
		input.close();
		
		System.out.println("Output : " + mergeStrings(firstString, secondString));		

	}
		
	public static String mergeStrings(String firstString, String secondString) {
			
		String merged = "";
		int same = Math.min(firstString.length(),secondString.length());
		
		for (int i=0 ; i<same ; i++) {
			merged = merged.concat(firstString.substring(i,i+1).concat(secondString.substring(i,i+1)));
		}
		
		if (firstString.length() > secondString.length()) {
			merged = merged.concat(firstString.substring(same,firstString.length()));
		}else if (firstString.length() < secondString.length()){
			merged = merged.concat(secondString.substring(same,secondString.length()));
		}
		
		return merged;
	}
	
}
