package com.smlsnnshn.Assignments.Assignment14.Question_04;

public class Question04_Test {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		System.out.println(person1.toString()); //undefined | undefined | -1
		
		person1.setFirstName("John");
		person1.setLastName("Doe");
		person1.setAge(44);		
		System.out.println(person1.toString() ); // John | Doe | 44
		
		Person person2 = new Person("Fatima", "Lee", 22);
		System.out.println(person2.toString()); //Fatima | Lee | 22
	
	}

}
