package com.smlsnnshn.Lessons.day16_classes_and_objects;

public class Employee {
	
	String name;
	String job_title;
	int salary;
	
	public void work() {
		
		System.out.println(name + " is working hard.");
		
	}
	
	public void attend_meeting() {
		
		System.out.println(name + " is attending a meeting");
		
	}
	
	public void introduce() {
		
		System.out.println("name: " + name + " job title: " + "salary: " + salary);
		
	}

}
