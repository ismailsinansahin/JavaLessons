package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question13_RouteInstructions {

	public static void main(String[] args) {
		
//		Write a program that will print out route instructions. 
//		Your program should take 2 parameters: start point and endpoint. 
//		Use left, right, up and down for navigation. 
//		Insert ">" between commands. 
//		If start point equals to endpoint - display: "start/end(start or end variable!) found".
//		Note: you may move only clockwise.
//		
//		Sample Output:
//
//		     Input: A
//		     Input: D
//		     Output: right > down > left: D found
//
//		     Input: C
//		     Input: C
//		     Output: C found
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the start point : ");
		String startPoint = input.nextLine().toUpperCase();
		System.out.println("Please enter the end point   : ");
		String endPoint = input.nextLine().toUpperCase();
		input.close();
		
		System.out.println();
		System.out.println("input : " + startPoint);
		System.out.println("input : " + endPoint);
		System.out.println();
		
		String route = "ABCDABC";	

		int sp = route.indexOf(startPoint);
		int ep = route.indexOf(endPoint,route.indexOf(startPoint));
		int cp = sp;
		
		for (int i=cp ; i<=ep ; i++) {
			
			if (i == ep) {
				System.out.print(": " + route.charAt(ep) + " found");
				break;
			}
			else if (route.charAt(i) == 'A') {
				System.out.print("right");
			}
			else if (route.charAt(i) == 'B') {
				System.out.print("down");
			}
			else if (route.charAt(i) == 'C') {
				System.out.print("left");
			}
			else if (route.charAt(i) == 'D') {
				System.out.print("up");
			}
			System.out.print(" > ");
			
		}	

	}

}
