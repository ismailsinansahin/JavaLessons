package com.smlsnnshn.Assignments.Assignment14.Question_05;

class TV{
	
	//Write a custom class TV that has 4 instance variables: 
	//int channel=1, int volumeLevel=1, boolean on = false, String brand = "undefined". 
	
	private int channel = 1;
	private int volumeLevel = 1;
	boolean on = false;
	private String brand = "undefined";
	
	//Create one "no arguments" constructor that prints message: "Creating TV object using no Args-constructor". 
	
	public TV() {
		System.out.println("Creating TV object using No-Args-Constructor");
	}

	//Also, create one more constructor that defines the instance variable brand, 
	//and displays the message: "Creating TV object using 1 arg-constructor".
	
	public TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using One-Arg-Constructor");
	}
	
	//Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), 
	//channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	//Volume can be only in the range between 1 and 7. You may change volume only if TV is on. 
	//Otherwise, display the message: "ERROR: TV is either OFF or invalid Volume level". 

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel<1 || volumeLevel>7 || on==false) {
			System.out.println("TV is either OFF or invalid Volume Level");
		}
		else {
			this.volumeLevel = volumeLevel;
		}
	}
	
	public int getChannel() {
		return channel;
	}
	
	//The value of a variable channel cannot be negative or zero, and cannot be higher than 120. 
	//If the user will try to set an invalid channel, display the message: "ERROR: TV is either OFF or invalid Channel".

	public void setChannel(int channel) {
		if (channel<1 || channel>120 || on==false) {
			System.out.println("TV is either OFF or Invalid Channel");
		}
		else {
			this.channel = channel;
		}
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
		
	//Declare methods channelUp() to increase variable channel by one, 
	//and channelDown() to decrease variable channel by one.
	
	public void channelUp() {
		this.setChannel(this.getChannel()+1);
	}

	public void channelDown() {
		this.setChannel(this.getChannel()-1);
	}
	
	//Declare methods volumeUp() to increase variable volume by one, 
	//and volumeDown() to decrease variable volume by one.
	
	public void volumeUp() {
		this.setVolumeLevel(this.getVolumeLevel()+1);
	}

	public void volumeDown() {
		this.setVolumeLevel(this.getVolumeLevel()-1);
	}
	
	//Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
	//Create isOn() method that will check tv status.
	//If the tv is already on, no need to turn it on again, display the message: "TV is already ON". 
	//If the tv is already off, then no need to turn it off again, display the message: "TV is already OFF". 
	
	public boolean isON() {
		return on;
	}
	
	public boolean turnON() {
		if (on==true) {
			System.out.println("The TV is already ON");
		}
		else {
			this.on=true;
		}
		return this.on;
	}
	
	public boolean turnOFF() {
		if (on==false) {
			System.out.println("The TV is already OFF");
		}
		else {
			this.on=false;
		}
		return this.on;
	}
		
}
