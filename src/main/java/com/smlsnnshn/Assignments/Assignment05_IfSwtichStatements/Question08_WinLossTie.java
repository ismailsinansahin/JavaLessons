package com.smlsnnshn.Assignments.Assignment05_IfSwtichStatements;

import java.util.Scanner;

public class Question08_WinLossTie {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Player Score: ");
		int player = input.nextInt();
		System.out.println("House Score: ");
		int house = input.nextInt();
		input.close();
		
		System.out.println("player = " + player);
		System.out.println("house = " + house);

		if (player>21) {
			System.out.println("");
			System.out.println("output: bust");
		}else if (house>player){
			System.out.println("");
			System.out.println("output: player loss");
		}else if (house<player){
			System.out.println("");
			System.out.println("output: player wins");
		}else if (house==player){
			System.out.println("");
			System.out.println("output: it is a tie");
		}

	}

}
