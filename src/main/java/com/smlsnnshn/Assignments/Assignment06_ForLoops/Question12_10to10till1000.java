package com.smlsnnshn.Assignments.Assignment06_ForLoops;

public class Question12_10to10till1000 {

	public static void main(String[] args) {
		
		for (int i=0 ; i<=1000 ; i+=10) {
			if (i==0) {
				System.out.print(i);
			}else {
				System.out.print("," + i );
			}
		}

	}

}
