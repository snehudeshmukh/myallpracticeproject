package com.learnjava.overloading;

public class Overloading2 {
	public static void test (int a) {
		System.out.println("Print int method:"+a);
	}
	public static void test(char c) {
		System.out.println("print char Method");
	}
	public static void test(int...a) {
		System.out.println("Print varargs method:" );
	}
	public static void main(String[] args) {
		test('a','b','c');
	}

}
