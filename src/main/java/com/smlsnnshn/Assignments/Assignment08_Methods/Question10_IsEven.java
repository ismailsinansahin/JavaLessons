package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question10_IsEven {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the number: ");
			int number = input.nextInt();
			input.close();
			System.out.println("isEven(" + number + ") --> " + isEven(number));

		}
		
		public static boolean isEven(int a) {
			if (a%2==0) {
				return true;
			}else {
				return false;
			}

	}

}
