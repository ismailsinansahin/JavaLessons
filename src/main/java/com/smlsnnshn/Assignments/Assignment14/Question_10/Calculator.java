package com.smlsnnshn.Assignments.Assignment14.Question_10;

class Calculator{
	
	int num1;
	int num2;
	
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//A static method can be used without instantiating a class object. 
	//Like in the calculator class create a plus and minus. 
	//but this time make them static methods. 
	//plus: gets two ints and returns the addition of the to numbers as an int   
	//minus: the same as plus its also static, but it returns the substructed value of the two ints it gets

	public static int plus(int num1, int num2) {
		return num1+num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1-num2;
	}
	
}
