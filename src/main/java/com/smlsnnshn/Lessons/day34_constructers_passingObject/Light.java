package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class Light {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(10, false);
		System.out.println("Returning from no-argument constructer no.1");
	}
	
	public Light(int noOfWatts, boolean indicator) {
		this(noOfWatts, indicator, "X");
		System.out.println("Returning from no-argument constructer no.2");
	}
	
	public Light(int noOfWatts, boolean indicator, String location) {		
		this .noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from no-argument constructer no.3");	
			
	}
	
	public Light(int a, int b) {
		System.out.println("Both int");
	}
	
	public Light(double a, double b) {
		System.out.println("Both double");
	}
	
	public Light(int a, double b) {
		System.out.println("One int, one double");
	}
	
	public Light(double a, int b) {
		System.out.println("One double, one int");
	}


}
