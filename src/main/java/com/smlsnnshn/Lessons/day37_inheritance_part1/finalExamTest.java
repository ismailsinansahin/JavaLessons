package com.smlsnnshn.Lessons.day37_inheritance_part1;

import java.util.Scanner;

public class finalExamTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Howmany questions were there in the final exam? : ");
		int questions = input.nextInt();
		System.out.println("Howmany questions did you miss? : ");
		int missed = input.nextInt();
		input.close();
		
		finalExam exam = new finalExam(questions, missed);
		
		System.out.println("The grade for the exam is " + exam.getGrade());

	}

}
