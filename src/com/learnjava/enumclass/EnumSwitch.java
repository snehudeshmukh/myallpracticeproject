package com.learnjava.enumclass;

enum Level {
	LOW, MEDIUM,HIGH
}
public class EnumSwitch {
	public static void main(String[] args) {
		Level s1 =Level.MEDIUM;
				System.out.println(s1);
				for (Level planet:Level.values()) {
				System.out.println(planet);//to string method used
				}
		switch(s1) {
		case LOW: 
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
	}
		
	}

}
