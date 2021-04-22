package com.smlsnnshn.Assignments.Assignment14.Question_01;

public class Question_01_Test {
	
	public static void main(String[] args) {
		
		Atts a = new Atts();
		a.name = "table";
		a.color = "brown";
		a.amount = 1;
		System.out.println(a.asString(a.name, a.color, a.amount));
		
	}

}


