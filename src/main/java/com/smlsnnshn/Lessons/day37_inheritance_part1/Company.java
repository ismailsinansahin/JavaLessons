package com.smlsnnshn.Lessons.day37_inheritance_part1;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "Tom";
		emp1.jobTitle = "SDET";
		emp1.age = 27;
		emp1.gender = 'M';
		
		emp1.work();
		
		emp1.eat("Salad");
		
//		emp1.attendClass();

	}

}
