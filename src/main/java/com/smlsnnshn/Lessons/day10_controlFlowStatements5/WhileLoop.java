package com.smlsnnshn.Lessons.day10_controlFlowStatements5;

public class WhileLoop {

	public static void main(String[] args) {

		//print 0-10	
		
		int i=0;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//using a loop , iterate until we have 10 students in the room
		
		int numberOfStudents=1;
		
		while(numberOfStudents<=10) {
			System.out.println("Student " + numberOfStudents);
			numberOfStudents++;
		}
		
		//print 11,10,9,8......1
		
		int num=11;
		while(num>=1) {
			System.out.print(num + " ");
			num--;
		}
		
	}
		
}
