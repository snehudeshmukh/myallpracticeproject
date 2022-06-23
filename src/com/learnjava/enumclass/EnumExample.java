package com.learnjava.enumclass;


public class EnumExample {
	public enum Season {
		WINTER,SPRING, SUMMER,FALL //defind inside the class
	}
	public static void main(String[] args) {
		for (Season s: Season.values()) {
			System.out.println(s);
		}
		System.out.println("value of Winter is"+Season.valueOf("WINTER"));
		System.out.println("Value of SUMMER is:"+Season.valueOf("SUMMER").ordinal());
	}
}
