package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question16_ContainJava {

	public static void main(String[] args) {
		
//		Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
//		such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
//		The string should be 4 and more characters.
//		Sample Output:
//		     input: javapython
//		     output: true
//		     input: cjavac++
//		     output: true
//		     input: c#javaruby
//		     output: false
		
		String string = "";
		Scanner input = new Scanner(System.in);
		
		while(string.length()<4) {			
			System.out.println("Enter a 4 or more character of string: ");
			string = input.next();
		}
		
		input.close();
	
		if (string.indexOf("java")==0 || string.indexOf("java")==1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	
	}

}
