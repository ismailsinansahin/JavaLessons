package com.smlsnnshn.Lessons.day40_AccessModifiers1;

public class Kangaroo extends Marsupial{
	
	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}

}
