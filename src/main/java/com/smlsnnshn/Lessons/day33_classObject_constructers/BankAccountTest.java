package com.smlsnnshn.Lessons.day33_classObject_constructers;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.println("What is your starting balance? : ");
		
		input = sc.next();
		
		BankAccount account = new BankAccount(input);
		
		System.out.println("Howmuch were you paid this month? : ");
		
		input = sc.next();
		
		sc.close();
		
		account.deposit(input);
		
		System.out.println("Your pay has been deposited. Your current balance is : " + account.getBalance());	

	}

}
