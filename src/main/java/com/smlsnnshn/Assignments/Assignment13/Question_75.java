package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// Search method accepts ArrayList of Strings and  a String to find and returns a String.
// It will look for an element within ArrayList that contains the value of the find. If 
// it finds it, the method needs to return the whole Element value. If an instance of find 
// doesn't exist return: "search failed"
// Sample Output:
//    search(["one apple","two orange","four banana"],"four")
//      returns:
//     "four banana"
//     ("four banana" contains "four" so method returns "four banana")
//     search(["hello","world"],"goodbye")
//     returns:
//     "search failed"
//     (no "goodbye" in any element)

public class Question_75 {

	public static void main(String[] args) {
		
		ArrayList <String> arr1 = new ArrayList <String> ();
		
		arr1.add("one apple");
		arr1.add("two orange");
		arr1.add("four banana");
		
		String str1 = "four";

		ArrayList <String> arr2 = new ArrayList <String> ();
		
		arr2.add("hello");
		arr2.add("world");
		
		String str2 = "goodbye";
		
		System.out.println("search(" + arr1 + ", " + str1 + ")");
		search(arr1, str1);
		if (arr1.size()==0) {
			System.out.println("result: Search Failed");
		}else {
		System.out.println("result: " + search(arr1, str1));
		}
		System.out.println();
		
		System.out.println("search(" + arr2 + ", " + str2+ ")");
		search(arr2, str2);
		if (arr2.size()==0) {
			System.out.println("result: Search Failed");
		}else {
		System.out.println("result: " + search(arr2, str2));
		}

	}

	public static ArrayList <String> search(ArrayList <String> arr, String str){
		
		int counter = 0;
		
		// If the element includes str it is assigned to the array
		for (int i=0 ; i<arr.size() ; i++) {
			if (arr.get(i).contains(str)) {
				arr.set(counter, arr.get(i));
				counter++;			
			}
		}
		
		// Removes other elements from the array
		while (arr.size() != counter) {
			arr.remove(counter);
		}
			
		return arr;
		
	}
	
}











