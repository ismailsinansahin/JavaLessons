package com.smlsnnshn.Assignments.Assignment14.Question_03;

/*
for example
Db db = new Db();
db.insertData("aaa",123);
System.out.println(db.getData());//aaa
System.out.println(db.getYint());//123
db.setData("zzz");
db.setYint(200);
System.out.println(db.getData());//zzz
System.out.println(db.getYint());//200
*/
	
class Db{
	
	//In Db class we have two attributes/instance variables with the private visibility. 
	//meaning they cannot be accessed outside of the class. Instance variables:
	//1) name: data - type: String Visibility/Access modifier: private
	//2) name: yint - type: int Visibility/Access modifier: private	
	
	private String name;
	private int yint;
	
	public void insertData(String name, int yint) {
		this.name = name;
		this.yint = yint;
	}
	
	//Methods:
	//	- insertData - lets you set the values to above encapsulated instance variables.
	//	- getData - getter method for private data
	//	- getYint - getter method for private yint
	//	- setData - setter method for private data
	//	- setYint - setter method for private yint
	
	public String getData() {
		return name;
	}
	public void setData(String name) {
		this.name = name;
	}
	public int getYint() {
		return yint;
	}
	public void setYint(int yint) {
		this.yint = yint;
	}
	
}
