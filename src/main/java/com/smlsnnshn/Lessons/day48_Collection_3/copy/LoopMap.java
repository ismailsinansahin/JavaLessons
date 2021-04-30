package com.smlsnnshn.Lessons.day48_Collection_3.copy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.smlsnnshn.Lessons.day46_Collection_1.Product;

public class LoopMap {

	public static void main(String[] args) {
		
		Map <String, String> dataMap = new HashMap<>();
		
		dataMap.put("url","qa3.vytrack.com");	
		dataMap.put("username","user66");
		dataMap.put("password","abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Bob");
		dataMap.put("storemanager", "John");
		
		//keySet --> returns all the keys in the map
		//values --> returns all the values in the map
		
		System.out.println("+++KEYS+++");
		for (String key : dataMap.keySet()) {
			System.out.println(key);
		}
				
		System.out.println("+++VALUES+++");
		for (String key : dataMap.values()) {
			System.out.println(key);
		}
			
		System.out.println("+++KEYS | VALUES+++");
		for (String key : dataMap.keySet()) {
			System.out.println(key + " | " + dataMap.get(key));
		}
		
		dataMap.forEach((k,v) -> System.out.println(k + " | " + v));
		
		Map<Integer,Product> studentMap = new HashMap<>();
		Map<String, String> data = new HashMap<>();
		Map<Integer, List<String>> data2 = new HashMap<>();
		Map<Integer, List<String[]>> data3 = new HashMap<>();
		Map<String, Map<Integer, Integer>> data4 = new HashMap<>();
		Map<String, Map<Integer, Product>> data5 = new HashMap<>();	
		
		System.out.println(studentMap);
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
		
	}

}
