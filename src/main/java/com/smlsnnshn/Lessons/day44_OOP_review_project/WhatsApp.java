package com.smlsnnshn.Lessons.day44_OOP_review_project;

public class WhatsApp extends MessagingApp implements IVideoCallable, IVoiceCallable{

	@Override
	public void call(String contact) {
		System.out.println("WhatsApp call");
	}

	@Override
	public void videoCall() {
		System.out.println("WhatsApp video call");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("WhatsApp send message");
	}

}
