package com.smlsnnshn.Lessons.day44_OOP_review_shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//create 4 shapes using Polymorphism

		Shape diamond = new Diamond();
		Shape square = new Square();
		Shape triangle = new Triangle();
		Object shapeObject = new Shape();
		
		diamond.draw();
		square.draw();
		triangle.draw();
		shapeObject.toString();
		
		//square.squareMethod();          //ERROR
		((Square)square).squareMethod();  //Downcasting --> cast reference type to object type
	
	}

}
