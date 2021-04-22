package com.smlsnnshn.Assignments.Assignment14.Question_05;

public class Question_05_Test {
	
	public static void main(String[] args) {
		
		//Creating the tv object
		TV tv1 = new TV();		
		
		System.out.println("isON() : " + tv1.isON());           
		tv1.turnOFF();
		tv1.setVolumeLevel(2);           
		tv1.turnON();		
		System.out.println("isON() : " + tv1.isON()); 
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println(tv1.getBrand());	  
		tv1.setBrand("LG");                 
		System.out.println(tv1.getBrand());	 
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		System.out.println("Initial channel   : " + tv1.getChannel()); 
		tv1.setChannel(40); 
		System.out.println("After setting 40  : " + tv1.getChannel());
		tv1.channelUp();	
		System.out.println("After channelUP   : " + tv1.getChannel()); 
		tv1.channelDown(); 
		System.out.println("After channelDOWN : " + tv1.getChannel());
		tv1.setChannel(121);                  
		System.out.println("After setting 121 : " + tv1.getChannel());    
		tv1.setChannel(0);                    
		System.out.println("After setting 0   : " + tv1.getChannel());
		tv1.setChannel(1); 
		System.out.println("After setting 1   : " + tv1.getChannel());
		tv1.channelDown(); 
		System.out.println("After channelDOWN : " + tv1.getChannel());
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");	
		
		System.out.println("Initial volume    : " + tv1.getVolumeLevel());
		tv1.setVolumeLevel(4);  
		System.out.println("After setting 4   : " + tv1.getVolumeLevel());
		tv1.volumeUp(); 
		System.out.println("After volumeUP    : " + tv1.getVolumeLevel());
		tv1.volumeDown();
		System.out.println("After volumeDOWN  : " + tv1.getVolumeLevel()); 
		tv1.setVolumeLevel(8);                  
		System.out.println("After setting 8   : " + tv1.getVolumeLevel()); 
		tv1.setVolumeLevel(0);                  
		System.out.println("After setting 0   : " + tv1.getVolumeLevel()); 
		tv1.setVolumeLevel(1);                  
		System.out.println("After setting 1   : " + tv1.getVolumeLevel()); 
		tv1.volumeDown();
		System.out.println("After volumeDOWN  : " + tv1.getVolumeLevel()); 
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		tv1.turnON();					
		tv1.turnOFF();
		System.out.println("isON() : " + tv1.isON());    
		tv1.turnOFF();	
		
		tv1.setChannel(5);
		System.out.println("After turnOFF : " + tv1.getChannel());
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	
		
	}


}
