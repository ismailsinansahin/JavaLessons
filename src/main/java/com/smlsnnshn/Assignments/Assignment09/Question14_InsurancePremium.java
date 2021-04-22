package com.smlsnnshn.Assignments.Assignment09;

import java.util.Scanner;

public class Question14_InsurancePremium {

	public static void main(String[] args) {
		
//		Write a program that will calculate car insurance premium.
//		Steps to write a program:
//		First things first, your program should ask the customer to provide a name, 
//		so display a message: "Enter your name".
//
//		Then ask the user about ownership of the US driver's license. 
//		Display message: "Do you have a US driver license?". 
//		If the user doesn't have a US driver's license - display warning message: 
//		"Invalid data!" and stop the program (use System.exit(0) 
//		after displaying warning message to stop the program).
//
//		Then ask the user to provide a zip code. 
//		If zip code equals to 20910 or 20740, add $60 to the premium 
//		(an amount to be paid for an insurance policy).
//		If zip code equals to 22102 or 22103, add $30 to the premium. 
//		Otherwise, add $50 to the premium.
//
//		Then ask the user about car ownership. 
//		Display message: "Is this vehicle Owned, Financed, or Leased?". 
//		If the car is owned, add $10 to the premium, otherwise, add $20 to the premium.
//
//		Then ask the user about car usage. 
//		Display message: "How is this vehicle primarily used?". 
//		If the car used for Business, add $50 to the premium. 
//		If the car is for pleasure add $10 to the premium. 
//		If the car is for Commute - add $20 to the premium.
//
//		Then ask the user how many days per week user drives to work. 
//		Display message: "Days Driven To Work And/Or School". 
//		Add $5 to the premium for every day driven to work.
//
//		Then, ask the user about how many miles customers drive to work or school. 
//		Display message: "Miles Driven To Work And/Or School". 
//		Increase premium per $1 for every 1 mile.
//
//		Then ask the customer about his age. Display message: "How old are you?".
//	     If age is less than 16, display the message: "Invalid data!", and stop the program.
//	     If age is between 16 and 18 (exclusive), multiply premium by 20.
//	     If age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6.
//	     If age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
//
//		Then, ask the customer about the driving experience. 
//		Make sure that experience is greater than 0 and the result of 
//		subtraction age from experience is greater or equals to 16. 
//		If no, display the message: "Invalid data!" and stop the program. 
//		Reduce premium on $5 for every year of experience.
//
//		Then, ask the customer about car accidents. 
//		Display message: "Have you had any accidents in the last 5 years?". 
//		If the answer equals "Yes" or "YES", ask customer about amount of accidents. 
//		Display message: "How many?", in order to get information about the amount of accidents. 
//		Add 20% to the premium price for every accident.
//
//		Then, ask the customer if he had continuous insurance for the past 12 months. 
//		Display message: "Have you had continuous insurance for the past 12 months?". 
//		If the customer provides a negative answer (No) - double the premium.
//
//		Then ask the user about the level of education. Display message: "What is the "
//		+ "highest level of education you have completed?".
//	     If the level of education equals to "Ph.D." or "Bachelors" or "Masters" - 
//	     reduce the premium by 5%.
//	     If the level of education equals "Doctors" reduce the premium by 10%.
//	     If the level of education equals "Less than High School" increase the premium by 5%.
//
//		After all, display the message "customer, here's your quote!". 
//		Instead of the customer, you need to insert customers' name. 
//		The display message: "Start Your Policy Today For: $premium". 
//		Instead of premium, your program should print the premium's variable value. 
//		Then display the message with reference number: "Reference number: referenceNumber". 
//		In order to build reference number variable (referenceNumber), 
//		concatenate first 2 letters of customer's name, age, last 2 letters of customer's name, 
//		zip code, and level of education without spaces. This value should be all upper case!
		
		Scanner input = new Scanner(System.in);
		int premium = 0;
		
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println();
		
		// Name
		
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.println();
		
		// US Driver License
		
		System.out.println("Yes .......... --> 1");
		System.out.println("No ........... --> 2");
		System.out.print("Do you have a US driver license? : ");
		int yesNo = input.nextInt();
		System.out.println();
		if (yesNo == 2) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		// Zip Code	
		
		System.out.print("Enter your zip code : ");
		int zipCode = input.nextInt();
		System.out.println();
		if (zipCode == 20910 || zipCode == 20740) {
			premium += 60;
		}else if (zipCode == 22102 || zipCode == 22103) {
			premium += 30;
		}else {
			premium +=50;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();

		// Ownership
		
		System.out.println("Owned ........ --> 1");
		System.out.println("Financed ..... --> 2");
		System.out.println("Leased ....... --> 3");
		System.out.print("Is this vehicle Owned, Financed, or Leased? : ");
		int ownership = input.nextInt();
		System.out.println();
		if (ownership == 1) {
			premium += 10;
		}else if (ownership == 2 || ownership ==3) {
			premium += 10;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Usage
		
		System.out.println("Business...... --> 1");
		System.out.println("Pleasure ..... --> 2");
		System.out.println("Commute ...... --> 3");
		System.out.print("How is this vehicle primarily used? : ");
		int usage = input.nextInt();
		System.out.println();
		if (usage == 1) {
			premium += 50;
		}else if (usage == 2) {
			premium += 10;
		}else if (usage == 3) {
			premium += 20;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Days/Miles driven
		
		System.out.print("Days Driven To Work And/Or School : ");
		int days = input.nextInt();
		System.out.println();
		System.out.print("Miles Driven To Work And/Or School : ");
		int miles = input.nextInt();
		System.out.println();		
		premium += ((days*5) + (days*miles*1));
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Age		
		
		System.out.print("How old are you? : ");
		int age = input.nextInt();
		System.out.println();
		if (age<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else if(age==16 && age==17) {
			premium *= premium*0.20;
		}else if(age>17 && age <=21) {
			premium *= premium*0.06;
		}else if(age>21 && age<25) {
			premium *= premium*0.02;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		//Experience
			
		System.out.print("How many years you've been driving? : ");
		int experience = input.nextInt();
		System.out.println();
		if (age-experience<16 || experience==0) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else {
			premium -= experience*5;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Accident
				
		System.out.println("Yes .......... --> 1");
		System.out.println("No ........... --> 2");
		System.out.print("Have you had any accidents in the last 5 years? : ");
		int accident = input.nextInt();
		System.out.println();
		if (accident==1) {
			System.out.print("How many accidents do you have in the last 5 years? : ");
			int numberOfAccident = input.nextInt();
			System.out.println();
			premium += numberOfAccident*(premium*0.20);
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Insurance
		
		System.out.println("Yes .......... --> 1");
		System.out.println("No ........... --> 2");
		System.out.print("Have you had continuous insurance for the past 12 months? : ");
		int insurance = input.nextInt();
		System.out.println();
		if (insurance==2) {
			premium += premium*2;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
		
		// Education
		
		System.out.println("PhD .......... --> 1");
		System.out.println("Bachelor ..... --> 2");
		System.out.println("Master ....... --> 3");
		System.out.println("Doctors ...... --> 4");
		System.out.println("High scholl .. --> 5");
		System.out.print("What is the highest level of education you have completed? : ");
		int education = input.nextInt();
		System.out.println();
		if (education==1 || education==2 || education==3) {
			premium -= premium*0.05;
		}else if(education==4) {
			premium -= premium*0.10;
		}else if(education==5) {
			premium += premium*0.05;
		}
		System.out.println("Current Premium : " + premium);
		System.out.println();
	
		input.close();
		
		System.out.println(name + ", here's your quote!");		
		System.out.println("Start Your Policy Today For: $" + premium);		
		System.out.println("Reference number: DA25ID20910PHD");
		
	}

}
