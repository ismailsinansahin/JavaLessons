package com.smlsnnshn.Assignments.Assignment10;

import java.util.Scanner;

public class Question22_PrintHTMLTag {

	public static void main(String[] args) {
		
//		Write a program, that will read HTML variable and output attribute value 
//		of id attribute (tag) into the console. Input will be provided in a single 
//		line as outlined below. If HTML variable doesnt contain <html> attribute, 
//		print out into the console message: "Invalid input!".
//
//		Sample Output:
//
//		input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//		output: myid
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your HTML code: ");
		String html = input.nextLine();
		input.close();
		
		if(html.indexOf("<html>")==-1) {
			System.out.println("Invalid input!");
		}else {
			System.out.println("Output : " + html.substring(html.indexOf('"')+1,html.indexOf('"',html.indexOf('"')+1)));
		}
		
	}
	
}
