package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class LightTest {

	public static void main(String[] args) {
		
		System.out.println("\nCreating Light Object no:1");
		Light l1 = new Light(20,true);
		
		System.out.println("\nCreating Light Object no:2");	
		Light l2 = new Light(10, 10);
		
		System.out.println("\nCreating Light Object no:3");	
		Light l3 = new Light();
		
		System.out.println("\nl1");
		System.out.println(l1.indicator);
		System.out.println(l1.location);
		System.out.println(l1.noOfWatts);
		
		System.out.println("\nl2");
		System.out.println(l2.indicator);
		System.out.println(l2.location);
		System.out.println(l2.noOfWatts);
		
		System.out.println("\nl3");
		System.out.println(l3.indicator);
		System.out.println(l3.location);
		System.out.println(l3.noOfWatts);

	}

}
