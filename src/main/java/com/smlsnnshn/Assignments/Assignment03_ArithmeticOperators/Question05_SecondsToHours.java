package com.smlsnnshn.Assignments.Assignment03_ArithmeticOperators;

public class Question05_SecondsToHours {
	
	/*
	 * Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.
	 * -Declare int variables inputSeconds, hours, minutes, seconds
	 * -Initialize the inputSeconds
	 * -Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds
	 * -Assign values to the hours, minutes, seconds variables
	 * -Display the result
	 * Sample Output:
	 * inputSecond is 3695
	 * 1 hours, 1 minutes, and 35 seconds
	 */

	public static void main(String[] args) {

		int seconds = 3000;
		int hours = seconds/3600;
		int minutes = (seconds%3600)/60;
		seconds = ((seconds%3600)%60);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");	

	}

}
