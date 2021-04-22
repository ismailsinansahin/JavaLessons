package com.smlsnnshn.Assignments.Assignment14.Question_03;

public class Question_03_Test {
		
	public static void main(String[] args) {
		
		Db db = new Db();
		db.insertData("aaa",123);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		System.out.println("******");
		
		db.setData("zzz");
		db.setYint(200);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		System.out.println("******");
		
	}

}
