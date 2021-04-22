package com.smlsnnshn.Assignments.Assignment11;

import java.util.Arrays;
import java.util.Scanner;

// Binary number is a number expressed in the base-2 numeral system or binary 
// numeral system, which uses only two symbols: typically 0 (zero) and 1 (one). 
// Each digit is referred to as a bit.
// Given an int variable decimal, write a java program to calculate the binary 
// value of the decimal variable and assign it a binary array. print out the 
// value of binary array matching below format. Feel free to use additional 
// arrays or formulas.
// Sample Output:
//     decimal -> 3
//     binary -> [0, 0, 0, 0, 0, 0, 1, 1]
//     decimal -> 35
//     binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//     decimal -> 255
//     binary -> [1, 1, 1, 1, 1, 1, 1, 1]

public class Question_48 {
		    		 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number you want to convert : ");
		int decimal = input.nextInt();
		input.close();
		System.out.println();
		System.out.println("decimal -> " + decimal);
		
		int[] template = {128, 64, 32, 16, 8, 4, 2, 1};
		int[] binary = new int[8];
		
		for(int i=0 ; i<template.length ; i++) {
			if (decimal/template[i] >= 1) {
				decimal -= template[i];
				binary[i] = 1;
			}else {
				binary[i] = 0;
			}		
		}
		
		System.out.println("binary  -> " + Arrays.toString(binary));

	}

}






























