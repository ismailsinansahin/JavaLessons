package com.smlsnnshn.Assignments.Lab01;

public class Lab1_StringTimes {
	
	/*Write a method that accepts a string and a non-negative number, 
	 * and prints a larger string that is number copies of the original String

    stringTimes("Hi", 2); = > HiHi
    stringTimes("Hi", 3); = > HiHiHi
    stringTimes("Hi", 1); = > Hi
    */
	

	public static void main(String[] args) {
		
		stringTimes("Hi", 3);
		
	}
	
	public static void stringTimes(String string,int number) {	
		
		for(int i=0;i<number;i++) {
			System.out.print(string);
		}	
		
	}
	
}
