package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_13_2D_Arrays {

	public static void main(String[] args) {
		
		int [][] numbers = {
				{1,2,3,4},               //row0
				{5,6},                   //row1
				{9,10,11,23,50,60}       //row2
		};
		
		System.out.println("NUmber of rows : " + numbers.length);
		
		System.out.println("Number of elements in Row 1 : " + numbers[0].length);
		
		for (int i=0 ; i<numbers.length ; i++)
			System.out.println("Number of numbers in row " + i + " is : " + numbers[i].length);

	}

}
