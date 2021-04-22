package com.smlsnnshn.Lessons.day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//Languages
		
		ArrayList <String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("Turkish");
		languages.add("German");
		languages.add("Spanish");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());

		languages.add("Arabic");
		languages.add("Russian");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		languages.remove(0);
		languages.remove(1);
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());

	}

}
