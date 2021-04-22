package com.smlsnnshn.Lessons.day11_controlFlowStatements6;

public class LabeledStatements {

	public static void main(String[] args) {

		int i=0;
		outer:
		do {
			i=8;	
			while(true) {
				System.out.println(i--);
				if(i==4) {
					break outer;
				}
			}
		}while(true);
		
	}

}
