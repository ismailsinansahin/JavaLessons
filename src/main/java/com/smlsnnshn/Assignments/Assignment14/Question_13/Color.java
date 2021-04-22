package com.smlsnnshn.Assignments.Assignment14.Question_13;

import java.util.Arrays;

/*
There are number of ways to describe color to computers, smartphones, tablets, browsers, etc.
One of the popular ways is to use RGB (red, green, blue) value.
In this task, we are going to write a simple Color class, that can represent only a few major colors.
Available colors are already initialized to static final arrays.  
Color.javaPreview the document
Color color = new Color();
System.out.println(color.toString() ) ; // prints "white"
Color color2 = new Color(255, 0, 0);
System.out.println(color2.toString() ) ; // prints "red"
Color color3 = new Color(255, 44, 88); 
System.out.println(color3.toString() ) ; // prints "n/a"
Color color4 = new Color(192, 192, 192); 
System.out.println(color4 ) ; // prints "light gray"
*/

class Color { 
	
	//rgb array with 3 ints is used to hold r,g,b values  
	//Available colors - ready with rgb code	
	
	String color;	
	private int[] rgb = new int[3];  
	
	public final static int[] WHITE       = new int[]{255, 255, 255};    
	public final static int[] LIGHT_GRAY  = new int[]{192, 192, 192};    
	public final static int[] GRAY        = new int[]{128, 128, 128};    
	public final static int[] DARK_GRAY   = new int[]{64, 64, 64};    
	public final static int[] BLACK       = new int[]{0, 0, 0};    
	public final static int[] RED         = new int[]{255, 0, 0};    
	public final static int[] PINK        = new int[]{255, 175, 175};    
	public final static int[] ORANGE      = new int[]{255, 200, 0};    
	public final static int[] YELLOW      = new int[]{255, 255, 0};    
	public final static int[] GREEN       = new int[]{0, 255, 0};    
	public final static int[] MAGENTA     = new int[]{255, 0, 255};    
	public final static int[] CYAN        = new int[]{0, 255, 255};    
	public final static int[] BLUE        = new int[]{0, 0, 255};   
	 
	//Public no-args constructor: sets default color as "white" (255,255,255)     
	//use this() keyword to call 3-args constructor to set white color
	public Color() {
		this(255, 255, 255);
	}
	
	//public constructor accepts 3 ints that represent color code.     
	//assign 3 int parameters to rgb array indexes(0,1,2)
	public Color(int r, int g, int b){
		this.rgb[0] = r;
		this.rgb[1] = g;
		this.rgb[2] = b;
	}

	//Override toString(from Object class).
	//Provides string description of the color like "red" ,"blue" based on rgb value.
	@Override
	public String toString() {
		
		//Compare value of rgb array with static color code arrays and find out what color it is.      
		//Arrays.equals(arr1,arr2) is easiest way to compare 2 int arrays     
		//returns a String color name like "white" or "blue"     
		//If rgb values does not match any available combinations, return "n/a"
		
		if (Arrays.equals(rgb, WHITE)) {
			color = "White";
		}
		else if (Arrays.equals(rgb, LIGHT_GRAY)) {
			color = "light gray";
		}
		else if (Arrays.equals(rgb, GRAY)) {
			color = "Gray";
		}
		else if (Arrays.equals(rgb, DARK_GRAY)) {
			color = "Dark Grey";
		}
		else if (Arrays.equals(rgb, BLACK)) {
			color = "Black";
		}
		else if (Arrays.equals(rgb, RED)) {
			color = "Red";
		}
		else if (Arrays.equals(rgb, PINK)) {
			color = "Pink";
		}
		else if (Arrays.equals(rgb, ORANGE)) {
			color = "Orange";
		}
		else if (Arrays.equals(rgb, YELLOW)) {
			color = "Yellow";
		}
		else if (Arrays.equals(rgb, GREEN)) {
			color = "Green";
		}
		else if (Arrays.equals(rgb, MAGENTA)) {
			color = "Magenta";
		}
		else if (Arrays.equals(rgb, CYAN)) {
			color = "Cyan";
		}
		else if (Arrays.equals(rgb, BLUE)) {
			color = "Blue";
		}
		else {
			color = "n/a";
		}
		return "Color [rgb=" + Arrays.toString(rgb) + ", color=" + color + "]";
	}
	
}
















