package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_02 {

	public static void main(String[] args) {
		
		int[] myList = {1,2,3,4};		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println(myList.length);
		
		for (int i=0 ; i<myList.length ; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
	
		String[] fruits = {"Apple", "Banana", "Orange"};			
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);		
		System.out.println(fruits.length);
	
		for (int i=0 ; i<fruits.length ; i++) {
			System.out.print(fruits[i] + " ");
		}
		System.out.println();

		int[] scores = {40,50,60,70,80,90,100};
		int sum=0;		
		
		for (int i=0 ; i<scores.length; i++) {
			sum += scores[i];		
		}
		System.out.println(sum/scores.length);

		String[] shoppingList = {"Cheese", "Pumpkin", "Bread", "Eggs", "Milk"};	
		for (int i=0 ; i<shoppingList.length ; i++) {
			System.out.println(shoppingList[i]);
		}
			
	}

}
