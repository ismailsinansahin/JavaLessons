package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question27_CoverString {

	public static void main(String[] args) {
		
//		coverString method will take 2 string parameters from the caller.
//		Your job is to write an important code that will :
//		- to search and find each appearance of coverME within main
//		- then surround it with [coverMe] (square brackets)
//		- if you cannot find the coverME within main after tirelessly looping 
//		then just return whole main itself covered [main].
//		- keep in mind that coverME value can be of any length.
//		Sample Output:
//		  coverString("java methods", "me") ) ; ==> "java [me]thods"
//		  coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
//		  coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
//		  coverString("apples", "pears") ) ; ==> "[apples]"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the main string : ");
		String main = input.nextLine();
		System.out.println("Please enter the part to be covered : ");
		String covered = input.nextLine();
		input.close();
		
		System.out.println("Output : " + coverString(main, covered));		

	}
		
	public static String coverString(String main, String covered) {
		
		String coveredString = main.replaceAll(covered,"["+covered+"]");
		return coveredString;
		
	}
	
}










