package com.smlsnnshn.Lessons.day36_static_class_members;

public class Student {
	
	String name;
	int age; 
	int idNumber;    // belongs to object
	static String school;    // belongs to class
	
	public Student(String name, int age, int idNumber) {
		super();
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}

}
