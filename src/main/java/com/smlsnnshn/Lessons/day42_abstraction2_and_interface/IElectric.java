package com.smlsnnshn.Lessons.day42_abstraction2_and_interface;

public interface IElectric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES_2 =  false;  // public static final 
	
	public abstract void charge();
	
	void charge2();  // public abstract, even if you write or not
	
	public default void methodA() {
		//code
	}
	
	public static void methodB() {
		//code
	}

}
