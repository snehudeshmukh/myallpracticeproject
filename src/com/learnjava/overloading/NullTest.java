package com.learnjava.overloading;

public class NullTest {
	public static void method (Object obj) {
		System.out.println("Method With Object");
	}
	public static void method(String str) {
		System.out.println("Method with String");
	}
public static void method(StringBuffer buf) {
	System.out.println("Method with StringBuffer");
}
public static void main(String[] args) {
	//method(null);
}
}
