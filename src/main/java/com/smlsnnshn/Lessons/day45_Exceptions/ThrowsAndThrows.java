package com.smlsnnshn.Lessons.day45_Exceptions;

public class ThrowsAndThrows {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is some exception");
					
		//throw new Exception("Another exception"); 
		
		String username = "";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name cannot be empty");
		}
		else {
			System.out.println("Valid username");
		}
		
		System.out.println("Valid username");
		
		sleep3(2);  //handle with the throws declaration on the main method
		
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) throws InterruptedException {
		sleep2(seconds);
	}

}
