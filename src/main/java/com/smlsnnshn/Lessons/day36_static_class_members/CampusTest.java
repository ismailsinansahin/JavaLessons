package com.smlsnnshn.Lessons.day36_static_class_members;

public class CampusTest {

	public static void main(String[] args) {
		
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country + "|" + c1.getCity());
		System.out.println(Campus.country + "|" + c2.getCity());
		
	}

}
