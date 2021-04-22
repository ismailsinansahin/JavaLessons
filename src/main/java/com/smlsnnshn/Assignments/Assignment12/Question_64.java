package com.smlsnnshn.Assignments.Assignment12;

import java.util.ArrayList;

//  Create a method that is called combineAL takes two parameters: 
//	an ArrayList of Strings called wordList1, and an ArrayList 
//	of Strings called wordList2 and returns an ArrayList
//  This method should create a new ArrayList of Strings, add all 
//  the words (in order) from wordList1, then add all the words (in order) 
//  from wordList2. In other words, it is combining all the elements from the two parameters.

public class Question_64 {

	public static void main(String[] args) {
		
		ArrayList <String> wordList1 = new ArrayList <String>();
		ArrayList <String> wordList2 = new ArrayList <String>();
		
		wordList1.add("GS");
		wordList1.add("FB");
		wordList1.add("AS");
		wordList2.add("TS");
		wordList2.add("BŞK");
		wordList2.add("SİV");
		wordList2.add("BJK");
		
		System.out.println("wordList1 => " + wordList1);
		System.out.println("wordList2 => " + wordList2);
		System.out.println("Combined wordList => " + combineAL(wordList1, wordList2));	

	}
	
	public static ArrayList <String> combineAL(ArrayList <String > wordList1, ArrayList <String> wordList2){
		
		ArrayList <String> wordList = new ArrayList <String>();
		
		for (String each : wordList1) {
			wordList.add(each);
		}
		for (String each : wordList2) {
			wordList.add(each);
		}
		return wordList;
		
	}

}
