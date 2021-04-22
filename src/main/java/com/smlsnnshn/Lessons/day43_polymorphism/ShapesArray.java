package com.smlsnnshn.Lessons.day43_polymorphism;

import java.util.ArrayList;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];
		shapes[0] = new Square();
		shapes[1] = new Triangle();    //polymorphism
		shapes[2] = new Circle();
		
		for (Shape each : shapes) {
			System.out.println(each.getClass());
			System.out.println(each.getClass().getName());
			System.out.println(each.getClass().getSimpleName());
			each.draw();  //do you know which class running from
		}		
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		//List<Shape> shapeList = new ArrayList<>(); //polymorphism
		shapeList.add(new Triangle());
		shapeList.add(new Square());
		shapeList.add(new Circle());
		
	}

}
