package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_Replace {

	public static void main(String[] args) {
		
		String str = "Moscow is a capital city of Russia.";
		System.out.println(str);
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email = "firstName_lastName@gmail.com";
		String company = "Capitol";
		String newEmail = email.replace("gmail", company);
		System.out.println(email);
		System.out.println(newEmail);
		
		String noSpace = str.replace(" ", "");
		System.out.println(noSpace);
		
		String mixed = "!'^j!'^+a!'^+v+^'!'^+!'^+a+^!^'+";
		System.out.println(mixed);
		mixed = mixed.replace("!","").replace("'","").replace("^","").replace("+","");
		System.out.println(mixed);
		
		String result = "About 3,900,000,000 results in 0.68 seconds";
		System.out.println(result);
		result = result.replace("About ","").replace("results in 0.68 seconds","").replace(",","");
		System.out.println(result);

	}

}
