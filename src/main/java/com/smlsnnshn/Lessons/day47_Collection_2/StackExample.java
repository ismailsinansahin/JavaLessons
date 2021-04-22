package com.smlsnnshn.Lessons.day47_Collection_2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		//Stack<Integer> numStack = new Stack<>();
		
		Vector<Integer> numStack = new Stack<>();
		
		//creating object
		//regular way --> Class - Class
		//polhymorphic way --> Parent/Interface - Class
		//who does decide the access? reference(Vector)
		
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(50);
		
		System.out.println(numStack.toString());
		
		//check value of the top of the stack
		System.out.println(((Stack<Integer>)numStack).peek());
		
		//read volue of the top of the stack and remove it
		((Stack<Integer>)numStack).pop();
		
		System.out.println(numStack.toString());
		System.out.println(((Stack<Integer>)numStack).peek());
		System.out.println(numStack.get(0));	

	}

}
