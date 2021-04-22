package com.smlsnnshn.Lessons.day44_OOP_review_project;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messanger";
	
	public MessagingApp() {
		System.out.println("Messaging App no-arg constructor");
	}
	
	public MessagingApp(String name, int count) {
		this.name = name;
		MessagingApp.count = count;
	}
	
	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("Messaging App is launched");
	}
	
	public static void close() {
		System.out.println("Messaging App is closing");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}
	
}
