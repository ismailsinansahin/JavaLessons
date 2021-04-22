package com.smlsnnshn.Assignments.Assignment13;

import java.util.ArrayList;

// A pizza delivery man has a scooter and a lot of deliveries to make, he will 
// have to refuel a few times. Refuel_times gets an ArrayList deliveries of the 
// amount of fuel it will take to get to destinations like:
// [1,3,5], first place will take 1 fuel unit to get to the second 3 fuel units etc...
// the max_fuel is the max fuel units in the vehicle fuel tank.
// you will need to returns how many refuels it will take to do all deliveries 
// (if the units are bigger then the tank he will refuel along the way in a gas station).
// for example:
//   refuel_times([7,7,7],7)
//   returns:3 (3 fuel stops 7 units each delivery)
//   refuel_times([9,1],3)
//   returns:4 (3 fuel stops for first delivery and +1 stop for second)
//   refuel_times([100,200,10],10)
//   returns:31

public class Question_72 {

	public static void main(String[] args) {
		
		double tank1 = 7;
		ArrayList <Integer> arr1 = new ArrayList <Integer> ();
		arr1.add(7);
		arr1.add(7);
		arr1.add(7);
		
		double tank2 = 3;
		ArrayList <Integer> arr2 = new ArrayList <Integer> ();
		arr2.add(9);
		arr2.add(1);
		
		double tank3 = 10;
		ArrayList <Integer> arr3 = new ArrayList <Integer> ();
		arr3.add(100);
		arr3.add(200);
		arr3.add(10);
		
		System.out.println("arr1 => " + arr1 + " tank capacity => " + tank1);
		System.out.println(refuelTimes(arr1,tank1) + " fuel stops");
		System.out.println();
		System.out.println("arr2 => " + arr2 + " tank capacity => " + tank2);
		System.out.println(refuelTimes(arr2,tank2) + " fuel stops");
		System.out.println();
		System.out.println("arr3 => " + arr3 + " tank capacity => " + tank3);
		System.out.println(refuelTimes(arr3,tank3) + " fuel stops");	

	}
	
	public static double refuelTimes(ArrayList<Integer> arr, double tank){
	
		double total = 0;
		for (int each : arr) {
			total += each;
		}
		double refTimes = Math.ceil(total/tank);
		return(refTimes);
		
	}

}