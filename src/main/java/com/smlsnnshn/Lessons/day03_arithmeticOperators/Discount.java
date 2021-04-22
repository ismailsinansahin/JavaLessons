package com.smlsnnshn.Lessons.day03_arithmeticOperators;

//This program calculates the sale price of an 
//item that is regularly priced at $59, with a 20% discount on it

public class Discount {
	
	public static void main(String[] args) {
		
		int regularPrice = 59;
		double discount;
		double salesPrice;
		
		discount = regularPrice*0.2;
		salesPrice = regularPrice-discount;
		
		System.out.println("Regular price is    : " + regularPrice);
		System.out.println("Discount amount is  : " + discount);
		System.out.println("Sale Price is       : " + salesPrice);
		
	}

}
