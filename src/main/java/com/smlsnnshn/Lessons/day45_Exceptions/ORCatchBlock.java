package com.smlsnnshn.Lessons.day45_Exceptions;

public class ORCatchBlock {

	public static void main(String[] args) {
		
		String str = "abc";
		
		try {
			System.out.println(str.toUpperCase());
		}
		catch(IllegalArgumentException | NullPointerException e){
			e.printStackTrace();
		}
	}

}
