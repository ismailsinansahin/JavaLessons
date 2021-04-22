package com.smlsnnshn.Lessons.day46_Collection_1;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		
		int[] numsArray = {30,50,100,5,6};
		String[] days = new String[7];
		days[0] = "Monday";
		
		Object[] obj = {2,"apple",false};
		
		System.out.println(obj[0]);
		
		ArrayList<Integer> list1 = new ArrayList<>();
//		List<Integer> list2 = new ArrayList<>();
//		Collection<Integer> list3 = new ArrayList<>();
		
		list1.add(44);
		list1.add(50);
		list1.add(100);
		
		System.out.println(numsArray[0]);		
		System.out.println(list1.get(0));

	}

}
