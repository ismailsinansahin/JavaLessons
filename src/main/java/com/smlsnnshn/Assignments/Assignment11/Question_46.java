package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;

//	Write a program that will find out the shortest words in the given string str. 
//	If there are few words that are evenly short, print them all. Use the split method 
//	in order to split the str string variable and create an array of strings. 
//	Print array with Arrays.toString() method. Sort array before printing.
//	Sample Output:
//	     input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
//	     output: [cat, old, ray]

public class Question_46 {
	    		 
	public static void main(String[] args) {
		
		String [] str = {"olive", "fish", "pursuit", "old", "warning", 
						 "python", "java", "coffee", "cat", "ray"};
		
		int counter = 0;
		int shortest = 0;
		String strFirst = str[0];		
		
		// finds the shortest length
		for (int i=1 ; i<str.length ; i++) {			
			if (str[i].length() < strFirst.length()) {
				shortest = str[i].length();
			}	
		}

		// finds howmany words are there with the shortest length
		for (int i=0; i<str.length ; i++) {
			if (str[i].length() == shortest) {
				counter++;
			}
		}
		
		// creates and keeps the shortest words
		String[] newStr = new String [counter];
		
		int j=0;
		for (int i=0 ; i<str.length ; i++) {
			if (str[i].length() == shortest) {
				newStr[j] = str[i];
				j++;
			}				
		}
		
		Arrays.sort(newStr);
		System.out.println("str   : " + Arrays.toString(str));
		System.out.println("newStr: " + Arrays.toString(newStr));

	}

}




