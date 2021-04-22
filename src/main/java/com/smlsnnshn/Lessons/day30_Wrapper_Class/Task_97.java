package com.smlsnnshn.Lessons.day30_Wrapper_Class;

public class Task_97 {

	public static void main(String[] args) {
		
		String s = "(((W&e??_lco73me %t%o co!@€,,<r>e <J>>>€@av'''%a777.||}{";
		System.out.println(filterString(s));

	}
	
	public static String filterString(String s) {
		
		String str = "";
		
		for (int i=0; i<s.length() ; i++) {
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i)==' ') {
				str = str + s.charAt(i);
			}
		}
		
		return str;
	
	}

}
