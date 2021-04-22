package com.smlsnnshn.Lessons.day47_Collection_2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya");
		
		System.out.println(queue.toString());
		
		String name = queue.remove();
		System.out.println(name);

		System.out.println(queue.toString());
		
		//removing an element from Queue using poll()
		//the poll() method is similar to remove() except that it returns null if the queue is empty
		name = queue.poll();
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//get the element at the front of the queue without removing it using peek()
		name = queue.peek();
		System.out.println(name);
		System.out.println(queue.toString());
				
	}

}
