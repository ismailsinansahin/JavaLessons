package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Equals {
	
	public static void main(String[] args) {
		
		String str1 = "Apple";
		String str2 = new String("Apple");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = "Banana";
		String str4 = "banana";
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str3.equalsIgnoreCase(str4));
				
	}	

}
