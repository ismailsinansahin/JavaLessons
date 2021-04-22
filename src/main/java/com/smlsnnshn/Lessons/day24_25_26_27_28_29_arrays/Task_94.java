package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Task_94 {

	public static void main(String[] args) {
		
		String StringInfo1 = "This info is used for creating password : xxxCD132Gxxx. Please do not share with anyone";
		String StringInfo2 = "This info is used for creating password : xxx00ABC!xxx. Please do not share with anyone";
		
//		System.out.println(StringInfo1);
//		System.out.println(StringInfo2);
		
		String[] StringInfo1Array = StringInfo1.split("password : ");
		String[] StringInfo2Array = StringInfo2.split("password : ");
		
//		System.out.println(StringInfo1Array[1]);
//		System.out.println(StringInfo2Array[1]);
		
		String pass1 = StringInfo1Array[1].split(". Please")[0];
		String pass2 = StringInfo2Array[1].split(". Please")[0];
		
//		System.out.println(pass1);
//		System.out.println(pass2);
		
		pass1 = pass1.substring(3,9);
		pass2 = pass2.substring(3,9);
		
//		System.out.println(pass1);
//		System.out.println(pass2);
		
		String password = pass1 + pass2;
		System.out.println("Password is : " + password);
		
	}

}
