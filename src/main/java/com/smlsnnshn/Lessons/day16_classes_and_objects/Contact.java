package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Contact {
	
	String name;
	String email;
	String phone_number;
	
	public void call() {
		
		System.out.println("calling " + name);
		
	}
	
	public void send_message() {
		
		System.out.println("sending mesage to " + name);
		
	}
	
	public void send_email() {
		
		System.out.println("sending email to " + name);
		
	}
	
}
