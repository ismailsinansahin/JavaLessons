package com.smlsnnshn.Lessons.day45_Exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));  //i might have a problem here
			System.out.println(str.charAt(1));  //WILL NOT BE EXECUTED
			
		}
		
		catch(Exception e) {
			
			System.out.println("Exception happened in try block and was caught");
			//EXCEL
			
			//try {}
			//catch(Exception e1) {}   //it is possible to use nested try-catch block
			
		}
		
		System.out.println("After try catch block");
		
	}

}
