package com.smlsnnshn.Assignments.Assignment14.Question_09;

public class Question_09_Test {
	
	public static void main(String[] args) {
		
		Telephone phone1 = new Telephone();
		System.out.println(phone1);
		Telephone phone2 = new Telephone();
		System.out.println(phone2);
		
		System.out.println("phone1 number   : " + phone1.getNumber());
//		System.out.println("phone1 quantity : " + phone1.quantity);         // should be Telephone.quantity (with classname)
//		System.out.println("phone1 total    : " + phone1.total);            // should be Telephone.quantity (with classname)
		System.out.println("**************************");
		System.out.println("phone2 number   : " + phone2.getNumber());
//		System.out.println("phone2 quantity : " + phone2.quantity);         // should be Telephone.quantity (with classname)
//		System.out.println("phone2 total    : " + phone2.total);            // should be Telephone.quantity (with classname)
		System.out.println("**************************");
		
		phone1.setNumber("1234");
		phone2.setNumber("5678");
		
//		phone1.quantity = 10;
//		phone2.total = 200;
		System.out.println("phone1 number   : " + phone1.getNumber());
//		System.out.println("phone1 quantity : " + phone1.quantity);         // should be Telephone.quantity (with classname)
//		System.out.println("phone1 total    : " + phone1.total);            // should be Telephone.quantity (with classname)
		System.out.println("**************************");
		System.out.println("phone2 number   : " + phone2.getNumber());
//		System.out.println("phone2 quantity : " + phone2.quantity);         // should be Telephone.quantity (with classname)
//		System.out.println("phone2 total    : " + phone2.total);            // should be Telephone.quantity (with classname)
		System.out.println("**************************");
		
	}

}
