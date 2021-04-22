package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question12_HamletQuote {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first parameter \"True or False\": ");
		boolean param1 = input.nextBoolean();
		System.out.print("Please enter the second parameter \"True or False\": ");
		boolean param2 = input.nextBoolean();
		input.close();
		System.out.println("hamletQuote(" + param1 + "," + param2 + ") --> " + hamletQuote(param1,param2));

	}
		
	public static boolean hamletQuote(boolean a, boolean b) {
		if (a||b) {
			return true;
		}else {
			return false;
		}

	}

}