package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Substring_toUpperCase_toLowerCase {

	public static void main(String[] args) {
		
		String sentence = "Java String manipulation is fun!";
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5,sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		//{{AUTOMATION}}
		System.out.println(chars.substring(0,2) + word + chars.substring(2));
		
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		String str1 = "     Java String manipulation is fun!      ";
		System.out.println(str1.trim());
		String str2 = "     Java String manipulation is fun!";
		System.out.println(str2.trim());
		String str3 = "Java String manipulation is fun!      ";
		System.out.println(str3.trim());
		String str4 = "Java      String      manipulation       is       fun!";
		System.out.println(str4.trim());
		
		String str5 = "   345   ";
		System.out.println("|" + str5.trim() + "|");
		
	}

}
