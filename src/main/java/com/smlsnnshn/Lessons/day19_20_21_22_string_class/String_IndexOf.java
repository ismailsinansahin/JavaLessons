package com.smlsnnshn.Lessons.day19_20_21_22_string_class;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		System.out.println(word1.indexOf("gith"));

		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Position of . is: " + i);
		System.out.println(url.charAt(i+1));
			
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println(country);
		System.out.println("Position of states: " + states);
		
		//contains
		
		String langs = "java, c++, python, tomcat, eclipse";
		
		if (langs.contains("python")) {
			System.out.println("Python is there");
		}else {
			System.out.println("Python is not there");
		}
		
		//indexOf
		
		if (langs.indexOf("python") > -1) {
			System.out.println("Python is there");
		} else {
			System.out.println("Python is not there");
		}
		
		//indexOf(2 args)
		
		String langs2 = "html-angular-selenium-jenkins-grid";
		
		int firstDash = langs2.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = langs2.indexOf("-", 5 );
		System.out.println(secondDash);
		
		int thirdDash = langs2.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = langs2.lastIndexOf("-");
		System.out.println(lastDash);
		
		
		
	
	}

}
