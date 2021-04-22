package com.smlsnnshn.Lessons.day17_java_memory_garbage_collection;

public class Bank_account {
	
	double balance;
	String account_holder;
	int account_number;
	
	public void deposit(double amount) {
		
		System.out.println("depositing " + amount + " dollars to" + account_number);
		balance+=amount;
		
	}
	
	public void withdrawal (double amount) {
		
		System.out.println("withdrawing " + amount + " dollars from " + account_number);
		balance-=amount;
		if (balance<0) {
			balance-=35;
		}
		
	}
	
	public void show_balance() {
		
		System.out.println("---------------------");
		System.out.println("Account Holder: " + account_holder);
		System.out.println("Account Number: " + account_number);
		System.out.println("Balance       : " + balance);
		System.out.println("---------------------");		
		
	}
	
	public void charge (double price, String item) {
		
		if (balance>=price) {
			System.out.println("buying " + item + " for " + price + " dollars from " + account_number);
			balance-=price;
		}else {
			System.out.println("insufficient funds to purchase" + item + " from " + account_number);
		}		
		
	}
		
}
