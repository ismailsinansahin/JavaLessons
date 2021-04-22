package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

public class Task_90 {

	public static void main(String[] args) {
		

		String[] cars = {"Toyota", "Honda", "Nissan", "BMW", "Mercedes"};
		
		boolean flag = false;
		
		for (int i=0 ; i < cars.length ; i++) {		
			if (cars[i].equals("Honda")) {
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("I found it!");
		}else {
			System.out.println("Not found it!");
		}
		
		
	}

}
