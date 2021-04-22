package com.smlsnnshn.Assignments.Assignment09;

public class Question11_RetrieveRelatedInformationFromTheSMS {

	public static void main(String[] args) {
		
//		We have a message variable already declared and assigned value in this format
//		Sender:<Mike Smith>. From Number:[202-123-3456]. 
//		Message:{I love programming and problem solving}
//
//		Declare variables: sender, phoneNumber, messageBody
//
//		By using String methods: retrieve related information from SMS message string 
//		and assign it to those 3 variables and print each variable in a separate line
//
//		Sample Output:
//
//		Sender: Mike Smith
//		Phone Number: 202-123-3456
//		Message body: I love programming and problem solving
		
		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		System.out.println("Sender       : " + message.substring(message.indexOf("<")+1,message.indexOf(">")));
		System.out.println("Phone Number : " + message.substring(message.indexOf("[")+1,message.indexOf("]")));
		System.out.println("Message Body : " + message.substring(message.indexOf("{")+1,message.indexOf("}")));

	}

}
