package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// Create a method called populate that accepts an empty int array 
// and populates it with numbers counting up.
// Sample Output:
//     populate(new int[3])
//     returns:[1,2,3]
//     populate(new int[5])
//     returns:[1,2,3,4,5]

public class Question_71 {

	public static void main(String[] args) {
		
		ArrayList <Integer> arr = new ArrayList <Integer> ();
		
		arr.add(3);	
		System.out.println("new int" + arr + " => " + populate(arr));
		arr.removeAll(arr);
		System.out.println();
		
		arr.add(5);
		System.out.println("new int" + arr + " => " + populate(arr));
 
	}
	
	public static ArrayList<Integer> populate(ArrayList<Integer> arr){
	
		int num = arr.get(0);
		arr.removeAll(arr);
		for (int i=0 ; i<num ; i++) {
			arr.add(i+1);
		}
		
		return(arr);
		
	}

}
