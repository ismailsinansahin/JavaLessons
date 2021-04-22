package com.smlsnnshn.Lessons.day09_controlFlowStatements4;

public class Task44_SpeedConverter {

	public static void main(String[] args) {

		//Constants
		final int STARTING_KPH = 60;
		final int MAX_KPH = 130;
		final int INCREMENT = 10;
		
		//VARIABLES
		int kph;    //to hold the speed in kph
		double mph; //to hold the speed in mph
		
		//Display the table header
		System.out.println("KPH\tMPH");
		System.out.println("---------------------");
		
		for(kph=STARTING_KPH; kph<=MAX_KPH; kph+=INCREMENT) {	
			//calculate the mph
			mph=kph*0.6214;
			//Display the speeds in kph and mph
			System.out.println(kph + "\t" + mph);
		}
			
	}

}
