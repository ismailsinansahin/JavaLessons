package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question24_CountJavaAndPython {

	public static void main(String[] args) {
		
//		Given a string, print out true if the number of appearances of "java" 
//		anywhere in the string is equal to the number of appearances of "python" 
//		anywhere in the string (case sensitive)
//		Sample Output:
//		     input: We study java not python
//		     output: true
//		     input: What's the difference between java, javascript and python?
//		     output: false
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String string = input.nextLine().toLowerCase();
		input.close();	
		
		int javaCounter = 0;
		int pythonCounter = 0;
		String javaString = string;
		String pythonString = string;
		
		while (javaString.contains("java")) {
			javaString = javaString.substring(javaString.indexOf("java")+4);
			javaCounter++;	
		}

		while (pythonString.contains("python")) {
			pythonString = pythonString.substring(pythonString.indexOf("python")+4);
			pythonCounter++;	
		}	
		
		if (javaCounter==pythonCounter) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}