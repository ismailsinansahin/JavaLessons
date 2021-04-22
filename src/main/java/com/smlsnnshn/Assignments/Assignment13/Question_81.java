package com.smlsnnshn.Assignments.Assignment13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// A slot machine (Links to an external site.) is a gambling device that the 
// user inserts money into and then pulls a lever (or presses a button). The 
// slot machine then displays a set of random images. If two or more of the 
// images match, the user wins an amount of money that the slot machine dispenses 
// back to the user.
// Create a program that simulates a slot machine. When the program runs, it 
// should do the following:
// Ask the user to enter the amount of money he or she wants to enter into the 
// slot. Instead of displaying images, the program will randomly select a word from 
// the following list: Cherries, Oranges, Plums, Bells, Melons, Bars
// To select a word, the program can generate a random number in the range of 0 through 5. 
// If the number is 0, the selected word is Cherries; if the number is 1, the selected 
// word is Oranges; and so forth. The program should randomly select a word from the list 
// three times and display all three of the words.
// If none of the randomly selected words match, the program will inform the user that he 
// or she has won $0.
// If two of the words match, the program will inform the user that he or she was won two 
// times the amount entered.
// If three of the words match, the program will inform the user that he or she has won 
// three times the amount entered.
// The program will ask whether the user wants to play again. If so, these steps are repeated. 
// If not, the program displays the total amount of money entered into the slot machine and 
// the total amount won.

public class Question_81 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int finalMoney = 0;
		int wonMoney = 0;
		int enteredMoney = 0;
		int bid = 0;
		String[] threeWords = new String[3];
		Scanner input = new Scanner(System.in);
				
		while (flag) {
			
			System.out.print("Please enter the money you want to bid: ");
			bid = input.nextInt();
			System.out.println();
			enteredMoney += bid;
					
			threeWords = select3Words();
			
			wonMoney = checkResults(bid, threeWords);					
			System.out.println("You won               : " + wonMoney);
			
			finalMoney += wonMoney;				
			
			System.out.println("Total entered to slot : " + enteredMoney);
			System.out.println("Final money           : " + finalMoney);
			System.out.println();
			
			System.out.print("Press \"1\" if you want to play again: ");
			int goNogo = input.nextInt();
			System.out.println();
						
			if (goNogo!=1) {
				flag = false;
			}
			
		}
		input.close();
			
	}

	public static String[] select3Words() {
		
		Random random = new Random();
		String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
		String[] randomWords = new String[3];
		
		for (int i=0; i<3 ; i++) {
			int randomNumber = random.nextInt(5)+1;
			randomWords[i] = words[randomNumber];
		}
		
		System.out.println(Arrays.toString(randomWords));	
		System.out.println();
		return randomWords;
		
	}
	
	public static int checkResults(int money, String[] randomWords) {
		
		int lastMoney = money;
		
		if (randomWords[0] == randomWords[1] && randomWords[0]==randomWords[2]) {
			lastMoney *= 3;
		}else if(randomWords[0] == randomWords[1] || randomWords[0] == randomWords[2] || randomWords[1] == randomWords[2]) {
			lastMoney *= 2;
		}else {
			lastMoney *= 0;
		}
		
		return lastMoney;
		
	}
	
}














