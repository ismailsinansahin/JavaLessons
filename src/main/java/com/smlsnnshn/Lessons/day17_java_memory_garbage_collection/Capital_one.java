package com.smlsnnshn.Lessons.day17_java_memory_garbage_collection;

public class Capital_one {

	public static void main(String[] args) {
		
		Bank_account acc1 = new Bank_account();
		acc1.account_holder = "Sinan Şahin";
		acc1.account_number = 12345;
		acc1.deposit(250);
		acc1.show_balance();
		acc1.withdrawal(100);
		acc1.show_balance();
		acc1.charge(50, "chair");
		acc1.show_balance();
		
	}

}
