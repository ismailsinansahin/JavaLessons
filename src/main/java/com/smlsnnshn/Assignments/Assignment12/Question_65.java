package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

// Create a method that is called removeAll takes two parameters: 
// an ArrayList of Strings called wordList, and a String called 
// targetWord and returns nothing
// This method should go through every element of wordList and remove 
// every instance of targetWord from the ArrayList.

public class Question_65 {

	public static void main(String[] args) {
		
		ArrayList <String> wordList = new ArrayList <String>();
		
		wordList.add("John");
		wordList.add("Mike");
		wordList.add("Mary");
		wordList.add("John");
		wordList.add("Michael");
		wordList.add("Jane");
		wordList.add("Jennifer");
		wordList.add("Mary");
		
		String targetWord = "John";			
		System.out.println("Initial wordList => " + wordList);			
		System.out.println("Removed wordList => " + removeAll(wordList, targetWord));

	}
	
	public static ArrayList <String> removeAll (ArrayList <String> wordList, String targetWord){
		
		for (int i=0 ; i<wordList.size() ; i++) {
			if (wordList.get(i) == targetWord) {
				wordList.remove(i);
			}
		}
		
		return wordList;
	
	}

}
