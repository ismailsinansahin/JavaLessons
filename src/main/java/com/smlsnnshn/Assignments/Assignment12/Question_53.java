package com.smlsnnshn.Assignments.Assignment12;

import java.util.Scanner;

// In the sport of diving, seven judges award a score between 0 and 10, 
// where each score may be a floating-point value. 
// The highest and lowest scores are thrown out, and the remaining scores 
// are added together. The sum is then multiplied by the degree of difficulty 
// for that dive. 
// The degree of difficulty ranges from 1.2 to 3.8 points. The total is then 
// multiplied by 0.6 to determine the divers' score.
// Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
// Sample Output:
//     output: Enter score for judge 1:
//     input: 1
//     output: Enter score for judge 2:
//     input: 5
//     output: Enter score for judge 3:
//     input: 5
//     output: Enter score for judge 4:
//     input: 5
//     output: Enter score for judge 5:
//     input: 5
//     output: Enter score for judge 6:
//     input: 8
//     output: Enter score for judge 7:
//     input: 9
//     output: Enter difficulty:
//     input: 2.1
//     output: Total: 35.28

public class Question_53 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] scores = new double[7];
		
		// Takes judges scores between 1-10
		for (int i=0 ; i<scores.length ; i++) {
			System.out.print("Enter score for judge " + (i+1) + " (between 1 - 10 : ");
			scores[i] = input.nextDouble();
			if (scores[i]<0 || scores[i]>10) {
				i--;
			}
		}
		System.out.println();
		
		// Takes difficulty degree between 1.2 - 3.8
		double degreeOfDifficulty = 0;
		while (degreeOfDifficulty<1.2 || degreeOfDifficulty>3.8) {
			System.out.println("Enter the difficulty degree (between 1.2 - 3.8): ");
			degreeOfDifficulty = input.nextDouble();	
		}
		input.close();
						
		// Finds min score	
		double min = scores[0];
		for (int i=0 ; i<scores.length ; i++) {
			if (scores[i]<min) {
				min = scores[i];
			}
		}
		
		// Finds max score
		double max = scores[0];
		for (int i=0 ; i<scores.length ; i++) {
			if (scores[i]>max) {
				max = scores[i];
			}
		}
		
		// Finds total scores except min and max
		double total = 0;
		for (int i=0 ; i<scores.length ; i++) {
				total += scores[i];
		}
		total -= (min + max);
		
		// Finds the final point
		double point = total * degreeOfDifficulty * 0.6; 
		System.out.println();
		System.out.printf("Total point : %.2f",point);
		
	}

}











