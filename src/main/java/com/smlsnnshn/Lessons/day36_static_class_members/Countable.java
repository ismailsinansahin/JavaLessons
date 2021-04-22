package com.smlsnnshn.Lessons.day36_static_class_members;

public class Countable {
	
	int instanceCount;
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstancCount() {
		return instanceCount;
	}

}
