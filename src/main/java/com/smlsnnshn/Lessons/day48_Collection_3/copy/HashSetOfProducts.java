package com.smlsnnshn.Lessons.day48_Collection_3.copy;

import java.util.HashSet;
import java.util.Set;

import Lessons.day46_Collection_1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		//create set collection and add new products
		
		Set<Product> prodSet = new HashSet<>();
		//Set<Product> prodSet = new TreeSet<>();  //it takes the price base of sorting
		
		
		prodSet.add(new Product("book", 25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("magazine", 7.99));
		
		//print the set
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		for (Product each : prodSet) {
			System.out.println(each);
			System.out.println(each.getPrice());
		}
		
		//print each product by using forEach method
		prodSet.forEach(each->System.out.println(each));
		prodSet.forEach(each->System.out.println(each.getName()));
	

	}

}