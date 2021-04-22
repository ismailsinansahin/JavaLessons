package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Array_10_2D_Arrays {

	public static void main(String[] args) {
		
		String[] myCars = {"Honda", "Mercedes", "BMW", "Toyota", "Ford"};
		
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1] == myCars[2]);
		
		System.out.println("----------------------------");
		
		for (int i=0 ; i<myCars.length ; i++) {
			System.out.println(myCars[i].length());
		}
		
		System.out.println("----------------------------");
		
		String str1 = "It will display the size of the array";
		String[] arr = str1.split(" ");
		System.out.println(arr.length);
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		
		System.out.println("----------------------------");
		
		String str2 = "Yaklaşık 6.690.000.000 sonuç bulundu (0,81 saniye)";	
		String str3 = "Yaklaşık 1.800.000.000 sonuç bulundu (0,84 saniye)";
		
		String[] arr2 = str2.split(" ");
		System.out.println(arr2.length);
				
		for (String each : arr2) {
			System.out.println(each);
		}
		
		String[] arr3 = str3.split(" ");
		System.out.println(arr3.length);
				
		for (String each : arr3) {
			System.out.println(each);
		}
	
		
	}

}