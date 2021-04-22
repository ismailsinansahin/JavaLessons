package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String str = "Eclipse ";
		
		System.out.println(str.startsWith("e"));
		System.out.println(str.endsWith("e"));
		
		System.out.println(str.startsWith("Ecl"));
		System.out.println(str.endsWith("se "));		

	}

}
