package com.smlsnnshn.Assignments.Assignment14.Question_07;

public class Question_07_Test {

	public static void main(String[] args) {
		
		GasTank gasTank = new GasTank(60);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		gasTank.addGas(40);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			
		gasTank.addGas(40);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		gasTank.useGas(60);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		gasTank.addGas(0.09);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("isEmpty() ==> " + gasTank.isEmpty());
		System.out.println("isFull() ==> " + gasTank.isFull());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		gasTank.addGas(59.82);
		
		System.out.println("Capacity : " + gasTank.capacity);
		System.out.println("Amount   : " + gasTank.amount);
		System.out.println("isEmpty() ==> " + gasTank.isEmpty());
		System.out.println("isFull() ==> " + gasTank.isFull());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		gasTank.useGas(29.91);
		
		System.out.println("getGasLevel() ==> " + gasTank.getGasLevel());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("fillUp() ==> " + gasTank.fillUp());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");	

	}
	
}
