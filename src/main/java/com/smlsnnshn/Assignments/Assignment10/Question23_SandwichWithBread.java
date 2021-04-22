package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question23_SandwichWithBread {

	public static void main(String[] args) {
		
//		A sandwich is two pieces of bread with something in between. 
//		Print the string that is between the first and last appearance 
//		of "bread" in the given string, or return string "nothing" if 
//		there are not two pieces of bread.
//		Sample Output:
//		     input: breadjambread
//		     output: jam
//		     input: xxbreadjambreadyy
//		     output: jam
//		     input: xxbreadapple
//		     output: nothing
//		     input: breadbutterbread
//		     output: butter
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the string : ");
		String string = input.nextLine();
		input.close();	
		
		int counter = 0;
		
		if (string.contains("bread")) {
			string = string.substring(string.indexOf("bread")+5);
			counter++;
		}

		if (string.contains("bread")) {
			string = string.substring(0,string.indexOf("bread"));
			counter++;
		}
		
		if (counter>1) {
			System.out.println("Output : " + string);
		}else {
			System.out.println("Output : ");
		}
		
	}

}
