package com.smlsnnshn.Lessons.day46_Collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");

		System.out.println("Before sorting");
		System.out.println(list.toString());	
		Collections.sort(list);
		System.out.println("After sorting");		
		System.out.println(list.toString());
		
		List<Product> prodList = new ArrayList<>();
		prodList.add(new Product("spoon", 13.99));
		prodList.add(new Product("bag", 100.00));
		prodList.add(new Product("shoes", 59.99));
		prodList.add(new Product("computer", 2100.99));
		
		System.out.println("Before sorting");
		System.out.println(prodList.toString());
		Collections.sort(prodList);
		System.out.println("After sorting");
		System.out.println(prodList.toString());
		
		Product p1 = new Product("spoon", 25.34);
		Product p2 = new Product("chair", 7.99);
		System.out.println(p1.compareTo(p2));
		
	}

}
