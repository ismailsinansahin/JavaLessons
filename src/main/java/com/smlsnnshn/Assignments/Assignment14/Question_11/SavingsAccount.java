package com.smlsnnshn.Assignments.Assignment14.Question_11;

class SavingsAccount extends BankAccount {
	
	//A double instance variable, interestRate.
	
	private double interestRate;
	
	//A constructor that accepts a parameter of type double which is 
	//used to initialize the instance variable.
	
	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	//A method getInterestRate that returns a value of interestRate.
	
	public double getInterestRate() {
		return interestRate;
	}
	
}
