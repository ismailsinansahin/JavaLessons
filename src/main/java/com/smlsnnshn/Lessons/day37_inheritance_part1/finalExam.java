package com.smlsnnshn.Lessons.day37_inheritance_part1;

public class finalExam extends GradeActivity{

	@SuppressWarnings("unused")
	private int numQuestion;
	private double pointEach;
	@SuppressWarnings("unused")
	private int numMissed;
	
	public finalExam (int numQuestion, int numMissed) {
		
		double numericScore;
		
		this.numQuestion = numQuestion;
		this.numMissed = numMissed;
		
		pointEach = 100.0 / numQuestion;
		numericScore = 100.0 - (numMissed * pointEach);
		
		setScore(numericScore);
			
	}
	
}
