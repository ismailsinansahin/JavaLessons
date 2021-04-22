package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Concat {

	public static void main(String[] args) {
		
		String word = "Java";
		
		System.out.println(word.concat("+Selenium"));
		System.out.println(word.concat(" in Selenium"));

		word = word.concat(" Selenium");
		System.out.println(word.concat(" Automation"));
		
		word = word.concat(" 1234");
		System.out.println(word.concat(" 5678"));
		
		word = word + 123;
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);
		
		String word2 = "Hi!";
		word2 = word2.concat(" How are you?").concat(" Are you ok?");
		System.out.println(word2);
			
	}

}
