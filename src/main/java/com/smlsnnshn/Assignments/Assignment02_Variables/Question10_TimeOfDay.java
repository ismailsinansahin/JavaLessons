package com.smlsnnshn.Assignments.Assignment02_Variables;

public class Question10_TimeOfDay {
	
	/*
	 * In this assignment, you will write code to put together the time of day.
	 * Like this: 12:24:33 PM
	 * 1. Declare variables: hour, minute, second that can hold int values.
	 *    Declare amOrPm variable that can hold a String ("AM" or "PM")
	 * 2. An instructor will set different values to your variables
	 * 3. Using the variables and concatenation, print values in the format mentioned above.
	 */

	public static void main(String[] args) {
		
		int hour = 12;
		int minute = 24;
		int second = 33;
		String amOrPm = "PM";
		System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);
		
	}
}
