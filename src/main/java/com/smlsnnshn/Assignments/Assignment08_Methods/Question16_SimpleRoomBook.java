package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question16_SimpleRoomBook {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Is there any room available for rent? : \"True or False\": ");
		boolean param1 = input.nextBoolean();
		System.out.print("Please enter the month of the date you want to book: ");
		int month = input.nextInt();
		System.out.print("Please enter the day of the date you want to book: ");
		int day = input.nextInt();
		input.close();
		int year = 2018;
		System.out.println("(" + param1 + "," + month + "," + day + "," + year + ") --> " + simpleRoomBook(param1, month, day));
		
	}
		
	public static boolean simpleRoomBook(boolean a, int b, int c) {
		
		if (a && !((b==7) && ((c>=1) && (c<=8)))){
			return true;
		}else {
			return false;
		}
		
	}

}
