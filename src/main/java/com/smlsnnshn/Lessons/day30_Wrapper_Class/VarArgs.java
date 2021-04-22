package com.smlsnnshn.Lessons.day30_Wrapper_Class;

public class VarArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);
		sum(5,10,50);
		
		System.out.println(concat("Apple", "Orenge", "123", "result"));

	}
	
	public static void sum(int... numbers) {
		
		int sum = 0;
		
		for (int each : numbers) {
			sum += each;
		}
		
		System.out.println(sum);
	}
	
	public static String concat (String...strings) {
		String newStr = "";
		for (String each : strings) {
			newStr = newStr + each.charAt(2);
		}
		return newStr;
	}

}
