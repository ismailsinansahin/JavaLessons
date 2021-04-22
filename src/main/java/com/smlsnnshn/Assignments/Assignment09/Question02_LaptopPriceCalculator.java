package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question02_LaptopPriceCalculator {

	public static void main(String[] args) {
		
//		Write a program that will calculate laptop price based on the components.
//		First, ask user for screen size. 
//		If screen size equals to 13.3, add $200 to the laptop price. 
//		If screen size equals to 15.0 - add $300 to the laptop price. 
//		If screen size equals to 17.3 - add $400 to the laptop price.
//
//		Then ask the user for CPU type. 
//		If CPU type equals to i3, add $150 to the laptop price. 
//		If CPU type equals to i5, add $250 to the laptop price. 
//		If CPU type equals to i7, add $350 to the laptop price.
//
//		Then ask the user for RAM size. 
//		Add $50 for every 4GB of ram to the laptop price.
//
//		Then, ask the user for the storage type. 
//		There are 2 options: SSD and HDD. 
//		If it's HDD - add $50 to the laptop price for every 500gb. 
//		If it's SSD - add $100 to the laptop price for every 500GB.
//
//		Then ask the user for screen resolution. 
//		There are 2 options: FULLHD and 4K. 
//		Add $100 if it's FULLHD screen and $200 if it's 4K screen.
//
//		Sample Output:
//
//		Display message: Select screen size:
//		input: 13.3
//		Display message: Select CPU type:
//		input: i7
//		Display message: Select RAM size:
//		input: 8
//		Display message: Select storage type:
//		input: SSD
//		Display message: Enter memory size:
//		input: 1000
//		Display message: Enter screen resolution:
//		input: 4K
//		Display message: Laptop price is: $1050.0
//		Example #2
//
//		Display message: Select screen size:
//		input: 13.3
//		Display message: Select CPU type:
//		input: i3
//		Display message: Select RAM size:
//		input: 4
//		Display message: Select storage type:
//		input: HDD
//		Display message: Enter memory size:
//		input: 500
//		Display message: Enter screen resolution:
//		input: FULLHD
//		Display message: Laptop price is: $550.0
		
		boolean flag = false;
		double laptopPrice = 0;
		double screenSize = 0;
		String cpuType = "";
		String storageType = "";
		int ramSize = 0;
		int memorySize = 0;
		String screenResolution = "";
		
		Scanner input = new Scanner(System.in);
		
		// Screen size selection
		
		while (flag == false) {
			System.out.println("13.3 -----> 1");
			System.out.println("15.0 -----> 2");
			System.out.println("17.3 -----> 3");
			System.out.println();
			System.out.print("Select screen size .. : ");
			int screenSizeChoice = input.nextInt();
			System.out.println();
			
			switch (screenSizeChoice) {
				case 1:
					screenSize = 13.3;
					laptopPrice += 200;
					flag = true;
					break;
				case 2:
					screenSize = 15.0;
					laptopPrice += 300;
					flag = true;
					break;
				case 3: 
					screenSize = 17.3;
					laptopPrice += 400;
					flag = true;
					break;
				default: 
					continue;		
			}
		}
		
		System.out.println("Laptop Price .............. : " + laptopPrice);
		System.out.println();
		
		flag = false;
		
		// CPU type selection
		
		while (flag == false) {
			System.out.println("i3 -------> 1");
			System.out.println("i5 -------> 2");
			System.out.println("i7 -------> 3");
			System.out.println();
			System.out.print("Select CPU Type ..... : ");
			int cpuTypeChoice = input.nextInt();
			System.out.println();
			
			switch (cpuTypeChoice) {
				case 1:
					cpuType = "i3";
					laptopPrice += 150;
					flag = true;
					break;
				case 2:
					cpuType = "i5";
					laptopPrice += 250;
					flag = true;
					break;
				case 3: 
					cpuType = "i7";
					laptopPrice += 350;
					flag = true;
					break;
				default: 
					continue;		
			}
		}
		
		System.out.println("Laptop Price .............. : " + laptopPrice);
		System.out.println();
		
		flag = false;
		
		// RAM size selection
		
		System.out.print("Select RAM size ..... : ");			
		ramSize = input.nextInt();
		System.out.println();
		laptopPrice = laptopPrice + (50 * ramSize/4);
		
		System.out.println("Laptop Price .............. : " + laptopPrice);
		System.out.println();
		
		// Memory size selection
		
		System.out.print("Enter memory size ... : ");			
		memorySize = input.nextInt();
		System.out.println();
		
		// Storage Type and memory size selection
		
		while (flag == false) {
			
			System.out.println("HDD ------> 1");
			System.out.println("SSD ------> 2");
			System.out.println();
			System.out.print("Select Storage Type . : ");
			int storageTypeChoice = input.nextInt();
			System.out.println();
			
			switch (storageTypeChoice) {
				case 1:
					storageType = "HDD";
					laptopPrice += (memorySize/500)*50;
					flag = true;
					break;
				case 2:
					storageType = "SSD";
					laptopPrice += (memorySize/500)*100;
					flag = true;
					break;
				default: 
					continue;
					
			}
			
		}
		
		System.out.println("Laptop Price .............. : " + laptopPrice);
		System.out.println();
		
		flag = false;

		// Screen resolution selection
		
		while (flag == false) {
			System.out.println("Full HD -> 1");
			System.out.println("4K ------> 2");
			System.out.println();
			System.out.print("Select Screen Resolution . : ");
			int screenResolutionTypeChoice = input.nextInt();
			System.out.println();

			switch (screenResolutionTypeChoice) {
				case 1:
					screenResolution = "Full HD";
					laptopPrice += 100;
					flag = true;
					break;
				case 2:
					screenResolution = "4K";
					laptopPrice += 200;
					flag = true;
					break;
				default: 
					continue;		
			}
			
		}
		
		System.out.println("Laptop Price .............. : " + laptopPrice);
		System.out.println();
		
		input.close();
		
		System.out.println("Screen Size ............... : " + screenSize);
		System.out.println("CPU Type .................. : " + cpuType);
		System.out.println("RAM Size .................. : " + ramSize);
		System.out.println("Storage Type .............. : " + storageType);
		System.out.println("Memory Size ............... : " + memorySize);
		System.out.println("Screen Resolution ......... : " + screenResolution);
		System.out.println();
		System.out.println("Laptop Price .............. : " + laptopPrice);

	}

}
