package com.smlsnnshn.Lessons.day44_OOP_review_project;

public interface IVoiceCallable {
	
	boolean CAN_CALL = true;    //public static final boolean
	
	//abstract method
	void call(String contact);  //public abstract void call
	
	//static method
	public static void decline() {
		System.out.println("Voice call is declined");
	}
	
	//default method
	public default void accept() {
		System.out.println("Voice call is accepted");
	}

}


