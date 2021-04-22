package com.smlsnnshn.Assignments.Assignment08_Methods;

public class Question04_HollowRectangular {

	public static void main(String[] args) {
		
		printHollowRect();

	}
	
	public static void printHollowRect() {
		
		for (int i=1 ; i<=5 ; i++) {
			for (int j=1 ; j<=5 ; j++) {
				if (i==1 || i==5) {
					System.out.print("*");
				}else {
					if (j==1 || j==5) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}				
			}
		System.out.println();
		}
		
	}
				
}
