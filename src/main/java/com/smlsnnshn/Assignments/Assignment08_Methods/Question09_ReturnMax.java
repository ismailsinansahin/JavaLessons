package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question09_ReturnMax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the x: ");
		int num1 = input.nextInt();
		System.out.print("Please enter the max: ");
		int num2 = input.nextInt();
		input.close();
		System.out.println("Max(" + num1 + "," + num2 + ") --> " + max(num1,num2));

	}
	
	public static int max(int x, int max) {
		if (x>max) {
			return max;
		}else {
			return x;
		}
	}

}
