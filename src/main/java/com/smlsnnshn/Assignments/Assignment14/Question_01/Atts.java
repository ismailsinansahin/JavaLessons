package com.smlsnnshn.Assignments.Assignment14.Question_01;

/*
The class Atts holds a few attributes and has a method called asString. 
The attributes are name and color -both are strings and amount which is 
an int.Their visibility is public. asString returns a string showing all 
the Atts in a format.
for example:
	Atts a = new Atts();
	a.name = "table";
	a.color = "brown";
	a.amount = 1;
	System.out.println(a.asString());
	name: table color: brown amount: 1
Create the required attributes and method inside the atts class
*/

public class Atts {	
	
	public String name;
	public String color;
	public int amount;
	
	public String asString(String name, String color, int amount) {		
		return ("name: " + this.name + " color: " + this.color + " amount: " + this.amount);
	}
	
}
