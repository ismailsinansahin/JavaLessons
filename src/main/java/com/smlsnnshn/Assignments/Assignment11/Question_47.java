package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// An array inhabitant represents cities and their respective populations. 
// For example, the following arrays shows 8 cities and their respective populations:
// [3, 6, 0, 4, 3, 2, 7, 1]
// Some cities have a population of 0 due to a pandemic zombie disease that 
// is wiping away the human lives. After each day, every city will lose half of its population.
// write a program to loop through each city population and make it lose half 
// of its population until all cities have no humans left. Make updates to 
// each element in the array And print the array-like below for each day:
//    Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
//    Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
//    Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
//    Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
//    ---- EXTINCT ----
//
// Write the program in a way that it will handle any number of people in 
// cities, above was just an example number to follow.

public class Question_47 {
		    		 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		int [] inhabitant = new int[8];
		
		for (int i=0 ; i<8 ; i++) {
			System.out.print("Please enter city number " + (i+1) + " population : ");
			inhabitant[i] = input.nextInt();
		}
		input.close();
		
		int day = 0;
		System.out.println();
		System.out.println("Day " + day + " " + Arrays.toString(inhabitant));
		
		int total = 0;
		for (int i=0; i<8 ; i++) {
			total += inhabitant[i];
		}
		
		while(total>0) {
			day++;
			for (int i=0 ; i<8 ; i++) {
				inhabitant[i] /= 2;
			}
			System.out.println("Day " + day + " " + Arrays.toString(inhabitant));
			total = 0;
			for (int i=0; i<8 ; i++) {
				total += inhabitant[i];
			}
		}
		
		System.out.println();
		System.out.println("----------  EXTINCT  ---------");
			
	}

}


























