package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Write a method that will take an argument of String ArrayLists called words, 
// and then set the 0th and 2nd indexes to be "git" and "gud" respectively.

public class Question_61 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("");
		words.add("");
		words.add("");
		setWords(words);
		
	}
	
	public static void setWords (ArrayList <String> words) {
		
		words.set(0, "git");
		words.set(2, "gud");
		System.out.println("words => " + words);
		
	}

}
