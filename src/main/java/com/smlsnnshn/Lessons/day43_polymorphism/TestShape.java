package com.smlsnnshn.Lessons.day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();   
		s1.draw();     
		
		Shape s2 = new Circle(); 
		s2.draw();
		
		Shape s3 = new Circle();  
		s3.paint();               					
		
		Shape s4 = new Square();  //can not access to square
		//s4.look();
		
		Square s5 = (Square) s4;  //casting, now can access to square
		s5.look();
		
		Square s6 = new Square(); 
		s6.look();

	}

}
