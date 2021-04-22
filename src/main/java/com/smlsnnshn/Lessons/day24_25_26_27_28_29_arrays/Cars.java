package com.smlsnnshn.Lessons.day24_25_26_27_28_29_arrays;

import java.util.Scanner;
import java.util.Random;

public class Cars {

	public static void main(String[] args) {
		
		Random random = new Random();
		int price = 0;		
		String[] cars = new String[7];		
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrrari";		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Pleae enter the index number of your dream car: ");
		int indexCar = input.nextInt();
		String selectedCar = cars[indexCar];
		input.close();			
		System.out.println("Your dream car is :" + cars[indexCar]);	
			
		switch (selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
			price = random.nextInt((40000-20000)+1)+20000;
			break;
		case "BMW": case "Mercedes":
			price = random.nextInt((80000-50000)+1)+50000;
			break;	
		case "Porsche": case "Ferrari":
			price = random.nextInt((150000-100000)+1)+100000;
			break;	
		default:
			System.out.println("Invalid Car!");
		}		
		System.out.println("Price for your selected car is : " + price);
		
	}

}
