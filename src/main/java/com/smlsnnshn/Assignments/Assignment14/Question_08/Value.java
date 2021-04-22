package com.smlsnnshn.Assignments.Assignment14.Question_08;

class Value {
	
	int value;
	boolean modified = false;
	
	//a constructor accepting a single integer parameter
	//a constructor with no parameters
	
	Value (){};	
	
	Value(int value){
		this.value = value;
		modified = wasModified();
	}
	
	//a method 'setVal' that accepts a single parameter
	//a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
	
	public void setVal(int value) {
		this.value = value;
		modified = wasModified();
	}
	
	//a method 'getVal' that returns an integer value as follows: 
	//if setVal has ever been called, it getVal returns the last value passed to setVal. 
	//Otherwise if the "single int parameter" constructor was used to create the object, 
	//getVal returns the value passed to that constructor. Otherwise getVal returns 0.
	
	public int getVal() {
		if (modified) {
			return value;
		}
		else{
			return 0;	
		}
	}
	
	//a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
	
	public boolean wasModified() {
		return true;
	}
	
}
