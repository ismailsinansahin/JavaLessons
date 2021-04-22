package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Scanner;

public class Task_87 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] days = new String[12];
		days[0] = "Mon";
		days[1] = "Tue";
		days[2] = "Wed";
		days[3] = "Thu";
		days[4] = "Fri";
		days[5] = "Sat";
		days[6] = "Sun";
	
		System.out.println("Please anter the day number: ");
		int index = input.nextInt();
		input.close();
		System.out.println("The month is : " + days[index-1]);
		
	}

}