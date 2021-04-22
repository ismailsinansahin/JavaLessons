package com.smlsnnshn.Assignments.Assignment08_Methods;

import java.util.Scanner;

public class Question15_ValidateTask {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Is there anything in the list? : \"True or False\": ");
		boolean param1 = input.nextBoolean();
		System.out.print("Please enter the next task id: ");
		int nextTaskId = input.nextInt();
		System.out.print("Please enter the current task id: ");
		int currentId = input.nextInt();
		input.close();
		System.out.println("(" + param1 + "," + nextTaskId + "," + currentId + ") --> " + validateTask(param1, nextTaskId, currentId));
		
	}
		
	public static boolean validateTask(boolean a, int b, int c) {
		
		if (a && (b==c+1) && (b!=10)){
			return true;
		}else {
			return false;
		}
		
	}

}
