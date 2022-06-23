package com.learnjava.overloading;

public class NullTest1 {
	public static void method (Object obj,Object obj1) {
		System.out.println("Method With Type-Object,Object");
	}
	public static void method (String str,Object obj) {
		System.out.println("method with Type-String,Object");
	}
	public static void method(Object obj,String str) {
		System.out.println("Method with type-Object,String");
	}
	public static void method(String str1,String str) {
		System.out.println("Method with type-String,String");
	}
	public static void main(String[] args) {
		method(null,null);
	}

}
