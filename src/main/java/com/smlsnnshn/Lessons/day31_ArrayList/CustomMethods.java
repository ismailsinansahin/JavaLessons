package com.smlsnnshn.Lessons.day31_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> rlist = getRandomList(20);
		System.out.println(rlist.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);

	}
	
	public static void printList(ArrayList<Integer> nums) {
		
		for (Integer each : nums) {
			System.out.println(each + " ");
		}	
		
	}
	
	public static double sumList(ArrayList<Double> nums) {
		
		double sum = 0;	
		for(Double each : nums) {
			sum = sum + each;
		}
		return sum;
		
	}
	
	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (int i=0 ; i<size ; i++) {
			newList.add(i);
		}
		return newList;
		
	}
	
	public static ArrayList<Integer> getRandomList(int size){
		
		Random r = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<>();
		
		for (int i=0 ; i<size ; i++) {
			randomNums.add(r.nextInt(101));			
		}
		return randomNums;	
		
	}
	
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (String each : strList) {		
			newList.add(Integer.parseInt(each));
		}
		return newList;
	}




}











