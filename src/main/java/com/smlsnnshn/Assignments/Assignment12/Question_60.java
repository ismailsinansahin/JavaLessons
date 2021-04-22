package com.smlsnnshn.Assignments.Assignment12;

import java.util.Arrays;

// combine two String arrays into one arraylist and return it as a string.
// Sample Output:
//     combineRs(["f","o","o"],[" b","a","r"])
//     returns "foo bar"
//     combineRs(["1","2","3"],[" 4"])
//     returns "1234"

public class Question_60 {

	public static void main(String[] args) {
		
		String[][] arr1 = {{"f","o","o"},{" b","a","r"}};
		String[][] arr2 = {{"1","2","3"},{"4"}};
		
		System.out.println("Array  => " + Arrays.deepToString(arr1));
		System.out.println("String => " + combineRs(arr1));
		System.out.println();
		
		System.out.println("Array  => " + Arrays.deepToString(arr2));
		System.out.println("String => " + combineRs(arr2));
		
	}
	
	public static String combineRs(String[][] arr) {
		
		String str = "";
		for (int i=0 ; i<arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++) {
				str += arr[i][j];
			}
		}
		
	return str;
		
	}

}
