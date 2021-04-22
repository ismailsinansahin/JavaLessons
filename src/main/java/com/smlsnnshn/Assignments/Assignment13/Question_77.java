package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// All products that go into the warehouse go through a machine that checks 
// if they are intact. To declare if the shipment of the product was good or 
// bad it also gets a limited number of how many products can be broken for 
// it to be considered a good shipment.
// badP is a method that gets an int array named products and an int named limit.
// products(int[]) - is an int array representing the products it checked, 
// if the item is intact it will be represented by 1 if it is broken its 0. 
// for example: [0,1,1,1,0], this array represents 2 broken items and 3 intact.
// limit(int) - represents the max amount of broken items for this shipment to 
// be considered good (and the method returns true) 
// for example: products [1,1,1,1,0] limit:3, there is only 1 broken product 
// and it is less than the limit (3) return true.
// Sample Output:
//     badP([1,1,1,1],5)
//     returns true
//     badP([1,1,1,1,0,0,0,0],2)
//     returns false
//     badP([1,1,0,0],2)
//     returns false
//     badP([1,1,1,0],6)
//     returns true

public class Question_77 {

	public static void main(String[] args) {
		
		ArrayList <Integer> arr1 = new ArrayList <Integer> ();
		int limit1 = 5;
		arr1.add(1);
		arr1.add(1);
		arr1.add(1);
		arr1.add(1);
		ArrayList <Integer> arr2 = new ArrayList <Integer> ();
		int limit2 = 2;
		arr2.add(1);
		arr2.add(1);
		arr2.add(1);
		arr2.add(1);
		arr2.add(0);
		arr2.add(0);
		arr2.add(0);
		arr2.add(0);
		ArrayList <Integer> arr3 = new ArrayList <Integer> ();
		int limit3 = 2;
		arr3.add(1);
		arr3.add(1);
		arr3.add(0);
		arr3.add(0);
		ArrayList <Integer> arr4 = new ArrayList <Integer> ();
		int limit4 = 6;
		arr4.add(1);
		arr4.add(1);
		arr4.add(1);
		arr4.add(0);
		
		System.out.println("badP(" + arr1 + "," + limit1 +")" + " => " + badP(arr1,limit1));
		System.out.println("badP(" + arr2 + "," + limit2 +")" + " => " + badP(arr2,limit2));
		System.out.println("badP(" + arr3 + "," + limit3 +")" + " => " + badP(arr3,limit3));
		System.out.println("badP(" + arr4 + "," + limit4 +")" + " => " + badP(arr4,limit4));
	}
	
	public static boolean badP(ArrayList<Integer> arr, int limit){
		
		boolean flag = false;
		int counter = 0;
	
		for (int i=0 ; i<arr.size() ; i++) {
			if (arr.get(i) == 0) {
				counter++;
			}
		}
		
		if (counter<limit) {
			flag = true;
		}
		
		return flag;
		
	}

}








