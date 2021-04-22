package com.smlsnnshn.Lessons.day36_static_class_members;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("One argument comstructor");
	}
	
	public AllBlocks() {
		System.out.println("No argument comstructor");
	}
	
	static {
		System.out.println("First static init");
	}
	
	{
		System.out.println("First instance init");
	}
	
	{
		System.out.println("Second instance init");
	}
	
	static {
		System.out.println("Second static init");
	}

}
