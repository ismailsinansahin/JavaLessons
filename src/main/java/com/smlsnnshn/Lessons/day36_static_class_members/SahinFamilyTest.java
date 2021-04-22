package com.smlsnnshn.Lessons.day36_static_class_members;

public class SahinFamilyTest {
	
	public static void main(String[] args) {
		
		SahinFamily sinan = new SahinFamily("Sinan", "baba", 39);
		SahinFamily melek = new SahinFamily("Melek", "anne", 40);
		SahinFamily bird = new SahinFamily();
		bird.setName("Lokum");
		bird.status = "pet";
		bird.age = 2;
		
		SahinFamily.adress = "Ev";
		
		System.out.println();
		System.out.println(sinan.toString());
		System.out.println(melek.toString());
//		System.out.println("SahinFamily [name=" + bird.getName() + ", status=" + bird.status + ", age=" + bird.age + ", adress=" + bird.adress +"]");
		System.out.println("SahinFamily [name=" + bird.getName() + ", status=" + bird.status + ", age=" + bird.age + ", adress=" + SahinFamily.adress +"]");
		
//		sinan.adress = "İş"; //It should be SahinFamily.adress
		SahinFamily.adress = "İş";
//		bird.name = "Lokum Şeker";     //because name is private, we can not reach outside of the class
//		sinan.name = "İsmail Sinan";   //because name is private, we can not reach outside of the class
		bird.setName("Lokum Şeker");   //we can only reach name with setters and getters method
		sinan.setName("İsmail Sinan");
		
		System.out.println();
		System.out.println(sinan.toString());
		System.out.println(melek.toString());
		System.out.println("SahinFamily [name=" + bird.getName() + ", status=" + bird.status + ", age=" + bird.age + ", adress=" + SahinFamily.adress +"]");
		
		sinan.birthday();
		melek.age = SahinFamily.birthday(melek.age);
		int x = SahinFamily.birthday(5);
		System.out.println(x);

		System.out.println();
		System.out.println(sinan.toString());
		System.out.println(melek.toString());
		System.out.println("SahinFamily [name=" + bird.getName() + ", status=" + bird.status + ", age=" + bird.age + ", adress=" + SahinFamily.adress +"]");
		
	}

}
