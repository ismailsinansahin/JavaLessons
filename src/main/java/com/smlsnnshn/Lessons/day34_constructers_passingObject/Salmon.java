package com.smlsnnshn.Lessons.day34_constructers_passingObject;

public class Salmon {
	
	int k;
	
	public Salmon() {
		this(10);
		System.out.println("k in public Salmon() : " + k);
	}
	
	public Salmon(int x) {
		k = x;
		System.out.println("k in public Salmon(int x) before + : " + k);
		k = k+20;
		System.out.println("k in public Salmon(int x) after +  : " + k);
	}
	
	public int getX() {
		System.out.println("k in public int getX() before + : " + k);
		k = k+5;
		System.out.println("k in public int getX() after +  : " + k);
		return k;
	}
	
	public static void main(String args[]) {
		
		int a = 5;
		
		System.out.println(a);
		
		Salmon p = new Salmon();
		
//		System.out.println("k : " + k);

		System.out.println("getX : " + p.getX());	
		
//		System.out.println("k in total : " , p.total());
		
	}
	
	public void total() {
		
		System.out.println(k);
		
	}

}
