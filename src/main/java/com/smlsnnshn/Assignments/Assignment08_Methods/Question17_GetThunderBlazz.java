package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question17_GetThunderBlazz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Can you buy it? : \"True or False\": ");
		boolean param1 = input.nextBoolean();
		System.out.print("Do you have a gift : \"True or False\": ");
		boolean param2 = input.nextBoolean();
		System.out.print("Please enter the amount of ingredient1: ");
		int ing1 = input.nextInt();
		System.out.print("Please enter the amount of ingredient2: ");
		int ing2 = input.nextInt();
		System.out.print("Please enter the amount of ingredient3: ");
		int ing3 = input.nextInt();
		input.close();
		System.out.println("(" + param1 + "," + param2 + "," + ing1 + "," + ing2 + "," + ing3 + ") --> " + getThunderBlazz(param1, param2, ing1, ing2, ing3));
		
	}
		
	public static boolean getThunderBlazz(boolean a, boolean b, int c, int d, int e) {
		
		if (a || b || ((c==1) && (d==2) && (e==3)) || ((c==3) && (d==1) && (e==2))){
			return true;
		}else {
			return false;
		}
		
	}

}
