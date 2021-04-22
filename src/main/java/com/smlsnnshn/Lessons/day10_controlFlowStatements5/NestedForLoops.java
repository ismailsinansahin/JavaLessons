package com.smlsnnshn.Lessons.day10_controlFlowStatements5;

public class NestedForLoops {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {	
			System.out.println("Outer Loop Iteration " + i);		
			for(int j=1;j<=2;j++) {			
				System.out.println("i = " + i + "; j = " + j);			
			}		
		}
		
		for(int i=0;i<3;i++) {			
			System.out.println("Outer Loop at state: " + i);
			for(int p=0;p<=3;p++) {
				System.out.println("Inner loop at state: " + p);
				if(p==3) {
					System.out.println();
				}
			}
		}
		
	}

}
