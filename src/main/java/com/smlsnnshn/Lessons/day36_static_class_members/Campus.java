package com.smlsnnshn.Lessons.day36_static_class_members;

public class Campus {
	
	private String city;
	static String country;
	
	static {
		System.out.println("Static Block-1");
		country = "USA";
	}
	
	public Campus (String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	static {
		System.out.println("Static Block-2");
		country = "UK";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
