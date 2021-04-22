package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Scanner;

public class Array_09_Methods {

	public static void main(String[] args) {	
		System.out.println(findCar(4,"Honda"));
	}	
	
	public static boolean findCar(int value, String toFindCar) {		
		for (String car : createArray(value)) {
			if (car.equalsIgnoreCase(toFindCar)){
				return true;
			}
		}
		return false;	
	}

	public static String[] createArray(int arraySize) {	
		Scanner input = new Scanner(System.in);
		String[] carArray = new String[arraySize];		
		for (int i=0 ; i<carArray.length ; i++) {
			System.out.println("Enter your car #" + i+1 );
			carArray[i] = input.next();
		}	
		input.close();
		return carArray;				
	}

}
