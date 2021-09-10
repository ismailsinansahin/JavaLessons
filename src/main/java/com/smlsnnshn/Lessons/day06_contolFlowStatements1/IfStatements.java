package com.smlsnnshn.Lessons.day06_contolFlowStatements1;

public class IfStatements {

	public static void main(String[] args) {
		
		int score = 60;
		
		if(score>=70) {	
			System.out.println("Excellent");
			System.out.println("You passed with grade A");		
		}
		
		System.out.println("***********************");
		
		int sales,bonus;
		double commisionRate,salary;		
		sales=5001;
		salary=10000;
		
		if(sales>5000) {
			bonus=500;
			commisionRate=1.12;		
			salary=salary*commisionRate+bonus;
		}
		
		System.out.println("Salary = " + salary);

	}

}
