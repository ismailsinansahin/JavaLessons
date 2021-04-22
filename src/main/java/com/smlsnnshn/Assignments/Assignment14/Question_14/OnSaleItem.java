package com.smlsnnshn.Assignments.Assignment14.Question_14;

public class OnSaleItem extends Item{
	
	//private instance variable, used for discount percentage
    private double discount;

    //public constructor for OnSaleItem
    //Calls Super class constructor by passing name,quantity,catalogNumber,price
    //it will assign the price after deducting(minus) discount from the price, assigns discount

    public OnSaleItem(String name, int quantity, int catalogNumber, double price, double discount) {
		super(name, quantity, catalogNumber, price-discount);
		this.discount = discount;
	}

    public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	//overrides toString from Item. returns Object description in this format:
    //OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
	@Override
	public String toString() {
		return "OnSaleItem [discount=" + getDiscount() + ", name()=" + getName() + ", price()=" + getPrice() + "]";
	}

}
