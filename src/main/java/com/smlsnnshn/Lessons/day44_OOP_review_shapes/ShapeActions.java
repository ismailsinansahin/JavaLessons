package com.smlsnnshn.Lessons.day44_OOP_review_shapes;

import static com.smlsnnshn.Lessons.day44_OOP_review_shapes.ShapeManager.*;
import static com.smlsnnshn.Lessons.day44_OOP_review_shapes.ShapeManager.drawShape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeActions {

	public static void main(String[] args) {
		
		Square mySquare = new Square();
		
		ShapeManager.drawSquare(mySquare);
		drawSquare(mySquare);
		
		drawSquare((Square)buildShape("square"));
		
		Object rand = new Random();
		System.out.println(((Random)rand).nextInt(5));
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Triangle());
		myList.add(new Diamond());
		myList.add(new Square());
		
		drawShape(myList);

	}

}
