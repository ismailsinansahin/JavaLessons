package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Scanner;

public class Task_86 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] months = new String[12];
		months[0] = "Jan";
		months[1] = "Feb";
		months[2] = "Mar";
		months[3] = "Apr";
		months[4] = "May";
		months[5] = "Jun";
		months[6] = "Jul";
		months[7] = "Aug";
		months[8] = "Sep";
		months[9] = "Oct";
		months[10] = "Nov";
		months[11] = "Dec";
		
		System.out.println("Please anter the month number: ");
		int index = input.nextInt();
		input.close();
		System.out.println("The month is : " + months[index-1]);
		
		System.out.println(months);	
		
	}

}
