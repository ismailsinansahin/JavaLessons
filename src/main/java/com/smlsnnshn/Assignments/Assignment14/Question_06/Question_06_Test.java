package com.smlsnnshn.Assignments.Assignment14.Question_06;

public class Question_06_Test {
	
	public static void main(String[] args) {
		
		//Creating pm object with 20 max time		
		ParkingMeter pm = new ParkingMeter(35);
		System.out.println("max time                  : " + pm.maxTime);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//Adding 25 to time left and printing values
		System.out.println("time left (before add 25) : " + pm.timeLeft);
		System.out.println(pm.add(25));
		System.out.println("time left (after add 25)  : " + pm.timeLeft);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//Adding 10 to time left and printing values
		System.out.println(pm.add(10));
		System.out.println("time left (after add 10): " + pm.timeLeft);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//Calling the expired method
		System.out.println("expired?                : " + pm.expired());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		//Calling tick method until time left becomes 0 then calling the expired method
		System.out.println("In ticking loop");
		for (int i=pm.timeLeft; i>0; i--) {
			pm.tick();
			System.out.println("time left           : " + pm.timeLeft);
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("expired?                : " + pm.expired());
		
	}

}
