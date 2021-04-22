package com.smlsnnshn.Lessons.day36_static_class_members;

public class SahinFamily {
	
	//Static Block or Static Initialization Block
	//It runs only one time when a class is loaded into the memory
	static {
		System.out.println("New family created");
		int a = 5;
		System.out.println(a);
	}
	

	
	int age;
	String status;
	private String name;
	static String adress;
	
	//Constructors
	
	public SahinFamily() {

	}
	
	public SahinFamily(String name, String status, int age) {
		this.name = name;
		this.status = status;
		this.age = age;	
	}
	
	//Even if this static block is after the constructors, it will run before them, but after the first static block
	static {
		System.out.println("Now its member are being created");	
	}
	
	//Getters and Setters for name variable	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Birthday static method increasing the age 1 year
	//It can be called with ClassName.birthday in the test class
	public void birthday() {
		age++;
	}
	
	public static int birthday(int age) {
		age++;
		return age;
	}
			
	// toString Method
	@Override
	public String toString() {
		return "SahinFamily [name=" + name + ", status=" + status + ", age=" + age + ", adress=" + adress + "]";
	}

}
