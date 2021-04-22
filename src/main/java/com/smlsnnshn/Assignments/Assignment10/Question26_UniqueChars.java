package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question26_UniqueChars {

	public static void main(String[] args) {
		
//		uniqueChars is a method that you will code now, should be able to 
//		accept any string in the word and return unique characters from the parameter.
//
//		Sample Output:
//		     uniqueChars("java") ==> "jav"
//		     uniqueChars("mama") ==> "ma"
//		     uniqueChars("spoon") ==> "spon"
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the word : ");
		String word = input.nextLine().toLowerCase();
		input.close();
		
		String unique = " ";
		
        for (int i=0 ; i<word.length(); i++) {
        	if (unique.indexOf(word.charAt(i))==-1) {
	        	unique = unique+(word.charAt(i));
		    }
	    }

        System.out.println("Output : " + unique);

	}

}
