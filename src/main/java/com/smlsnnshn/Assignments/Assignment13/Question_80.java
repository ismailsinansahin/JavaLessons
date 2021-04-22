package com.smlsnnshn.Assignments.Assignment13;

import java.util.Arrays;

// short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
// Above array stores the scores of a batsman in his last 10 innings in the game of cricket.
// If the score is greater than or equal to 50 but less than 100, it is regarded as a half-century.
// If the score is greater than or equal to 100 but less than 200, it is regarded as a century.
// If the score is greater than or equal to 200, it is regarded as a double-century.
// NOTE: No scenario of the triple-century in this case.
// Write the code to print the number of half-centuries, centuries and double-centuries scored by the batsman.

public class Question_80 {

	public static void main(String[] args) {
		
		int[] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		int counterHc = 0;
		int counterC = 0;
		int counterDc = 0;
		
		for (int i=0; i<scores.length; i++) {
			if (scores[i] >= 50 && scores[i] < 100) {
				counterHc++;
			}else if (scores[i] >=100 && scores[i] < 200) {
				counterC++;
			}else if (scores[i] >=200) {
				counterDc++;
			}
		}
		
		System.out.println("int[] scores = " + Arrays.toString(scores));
		System.out.println("Half Century   => " + counterHc);
		System.out.println("Century        => " + counterC);
		System.out.println("Dpubşe Century => " + counterDc);

	}

}
