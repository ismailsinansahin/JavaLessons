package com.smlsnnshn.Lessons.day10_controlFlowStatements5;

public class Task47_Pattern1 {

	public static void main(String[] args) {
		
//		System.out.println("******");
//		System.out.println("******");
//		System.out.println("******");
//		System.out.println("******");
//		System.out.println("******");
//		System.out.println("******");
		
		int rows = 6;
		int columns = 6;
		
		for (int i=1 ; i<=rows ; i=i+1) {
			for (int j=1 ; j<=columns ; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}

		

//		int rows=6;
//		int columns=6;
//		
//		for(int i=1;i<=rows;i++) {	
//			for(int j=1;j<=columns;j++) {			
//				System.out.print("*");		
//			}
//			System.out.println();		
//		}
	
	}

}
