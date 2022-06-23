package com.learnjava.enumclass;


enum Color {
	RED,GREEN,BLUE,YELLOW;
	
	private Color() {
		System.out.println("Constructor Called for: "+this.toString());//enum constructor called separately for each constant
		
	}
	public void colorInfo() {
		System.out.println("Universal Color");//concrete method in enum class
}
}
public class EnumConstructor {
	public static void main(String[] args) {
	Color c1=Color.RED;
	System.out.println(c1);
	c1.colorInfo();
	}

	}
