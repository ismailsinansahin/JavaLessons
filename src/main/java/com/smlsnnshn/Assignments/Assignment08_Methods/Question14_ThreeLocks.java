package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question14_ThreeLocks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first parameter \"True or False\": ");
		boolean param1 = input.nextBoolean();
		System.out.print("Please enter the second parameter \"True or False\": ");
		boolean param2 = input.nextBoolean();
		System.out.print("Please enter the third parameter \"True or False\": ");
		boolean param3 = input.nextBoolean();
		input.close();
		System.out.println("((" + param1 + " && " + param2 + ") || " +param3 + ") --> " + threeLocks(param1,param2,param3));

	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if ((a&&b)||c){
			return true;
		}else {
			return false;
		}
		
	}

}
