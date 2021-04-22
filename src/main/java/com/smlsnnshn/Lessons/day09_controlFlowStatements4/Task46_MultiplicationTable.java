package com.smlsnnshn.Lessons.day09_controlFlowStatements4;

public class Task46_MultiplicationTable {

	public static void main(String[] args) {

		int num=10;
		
		System.out.println("Multiplication table for " + num);
		System.out.println("----------------------------");
			
		for(int i=1;i<=10;i++) {		
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
	}

}
