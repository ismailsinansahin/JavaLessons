package com.smlsnnshn.Lessons.day45_Exceptions;

public class TryCatch2 {
	
	static String name;

	public static void main(String[] args) {
				
		//System.out.println(nums{0]);  //compile error
		
		System.out.println("***************************************************");
		
		int[] nums = {36,6,34,12};
		
		try {			
			System.out.println(nums[6]);	
		}
		catch(Exception e) {
			//System.out.println("Wrong index");
			e.printStackTrace();
			System.out.println(e.getMessage());    //use one of them
		}
		
		System.out.println("***************************************************");
		
		try {
//			int j=100;
//			int n=j/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());  //use one of them
		}
		
		System.out.println("***************************************************");
		
		try {
			System.out.println(name.toUpperCase());	
		}
		catch(Exception e){
			System.out.println("Null Pointer Exception Happened");
			System.out.println("Here is the message : " + e.getMessage());
			System.out.println("Here is the stack trace : ");
			e.printStackTrace();	
		}
		
		System.out.println("***************************************************");
		
	}

}
