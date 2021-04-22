package com.smlsnnshn.Lessons.day47_Collection_2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//looping by using for each loop	
		for(int each : nums) {
			System.out.print(each + " | ");
		}
		System.out.println();
		
		//looping by using for iterator loop		
		for (int i=0; i<nums.size(); i++) {
			System.out.print(nums.get(i) + " | ");
		}
		System.out.println();
		
		//looping by method.Lambda expressions
		nums.forEach(each -> System.out.print(each + " | "));
		System.out.println();
		
		nums.removeIf(each -> each<500);
		nums.forEach(each -> System.out.print(each + " | "));
		
		
		
		
		

	}

}
