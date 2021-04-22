package com.smlsnnshn.Lessons.day31_ArrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		
		System.out.println(list2.toString());
		
		//Copy all values form list1
		
		ArrayList<String> months = new ArrayList<String>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		//How to check if Feb is in second position
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).contentEquals("Feb"));
		
		if (months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values ate missing");
		}
		
		list1.add("XXXXXXXX");
		if (months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		
		list1.remove("XXXXXXXX");
		list1.add("Jan");
		if (months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
