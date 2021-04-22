package com.smlsnnshn.Lessons.day40_AccessModifiers1;

public class Marsupial {
	
	public boolean isBiped() {
		return false;
	}
	
	public void getMarsupiaDescription() {
		System.out.println("Marsupial walks on the ewo legs: " + isBiped());
	}

}
