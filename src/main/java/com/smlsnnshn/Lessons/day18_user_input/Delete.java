package com.smlsnnshn.Lessons.day18_user_input;

public class Delete {
	
// Demonstrate the memory usage with this program and explain what is going on
		
	public static void main(String[] args) {
		
		x();
		
		Car c2 = new Car();
		
		y(5);
		
		Car c3 = new Car();
		
		c3 = c2;
		
		System.out.println(c3);
					
	}
		
	public static void x() {
			
		Car c1 = new Car();
		
		System.out.println(c1);
		
	}
		
	public static int y(int b) {
		
		return b;
		
	}

}
