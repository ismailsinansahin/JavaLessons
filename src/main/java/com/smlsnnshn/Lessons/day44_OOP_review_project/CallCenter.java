package com.smlsnnshn.Lessons.day44_OOP_review_project;

public class CallCenter {

	public static void main(String[] args) {
		
		WhatsApp wa = new WhatsApp();
		
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Hello World");
		wa.videoCall();
		wa.accept();
		
		IVoiceCallable.decline();	
		System.out.println(IVoiceCallable.CAN_CALL);
		
		System.out.println("******************************");
		
		IVoiceCallable obj = new WhatsApp(); //polymorphic way
		//obj.launch()  //go to the IVoiceCallable and find the launch method and run it
		((MessagingApp)obj).launch();
		//obj.allOSCompatible = false;
		((MessagingApp)obj).allOSCompatible = false;
		obj.call("Mr.Tom");		
		//obj.videoCall();
		((WhatsApp)obj).videoCall();
		((IVideoCallable)obj).videoCall();
		
	}

}
