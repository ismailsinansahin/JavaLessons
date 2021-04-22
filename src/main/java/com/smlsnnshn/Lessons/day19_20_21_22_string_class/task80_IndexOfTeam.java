package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class task80_IndexOfTeam {

	public static void main(String[] args) {
		
		String str1 = "GS, FB, BJK, TS";
		String str2 = "GS";
		checkedStirng(str1, str2);

	}
	
	public static void checkedStirng(String str1, String str2) {
		
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		} else {
			System.out.println("not found");
		}		
		
	}

}
