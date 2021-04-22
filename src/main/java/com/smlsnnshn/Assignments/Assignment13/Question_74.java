package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// This method gets an arraylist of Integers and a number(Integer).
// it returns an arraylist. It removes any instance of the number it gets from the arraylist.
// Sample Output:
//    romoveInst([1,1,2,3,1,4],1)
//    returns: [2,3,4]
//    romoveInst([3,4,3,3],4)
//    returns: [3,3,3]

public class Question_74 {

	public static void main(String[] args) {
		
		ArrayList <Integer> arr1 = new ArrayList <Integer> ();
		
		arr1.add(1);
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(1);
		arr1.add(4);
		
		int number1 = 1;

		ArrayList <Integer> arr2 = new ArrayList <Integer> ();
		
		arr2.add(3);
		arr2.add(4);
		arr2.add(3);
		arr2.add(3);
		
		int number2 = 4;
		
		System.out.println("removeInst(" + arr1 + ", " + number1 + ")");
		System.out.println("result    :" + removeInst(arr1, number1));
		System.out.println();
		
		System.out.println("removeInst(" + arr2 + ", " + number2+ ")");
		System.out.println("result    :" + removeInst(arr2, number2));

	}

	public static ArrayList <Integer> removeInst(ArrayList <Integer> arr, int number){
		
		while (arr.indexOf(number) != -1) {
			arr.remove(arr.indexOf(number));
		}
		
		return arr;
		
	}
	
}













