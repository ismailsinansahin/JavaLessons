package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_12_2D_Arrays {

	public static void main(String[] args) {
		
		String [][] team = new String[2][4];
		
		team[0][0] = "Mike";
		team[0][1] = "Tonny";
		team[0][2] = "Smith";
		team[0][3] = "Evan";
		
		team[1][0] = "David";
		team[1][1] = "Emy";
		team[1][2] = "John";
		team[1][3] = "Ryan";
		
		//Quickest way to create 2D arrays
		
		String [][] teams = {
				{"Mike", "Tonny", "Smith", "Evan"},
				{"David", "Emy", "John", "Ryan"}
		};
		
		System.out.println("First player of the first team : " + team[0][0]);
		
		System.out.println("Number of teams : " + teams.length);

		
	}

}
