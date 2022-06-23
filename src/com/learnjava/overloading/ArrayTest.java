package com.learnjava.overloading;

public class ArrayTest {
	public static void test(int[] intArr) {
		System.out.println("Array int");
	}
	public static void test(char[] charArr ) {
		System.out.println("Char Array");
	}
	public static void test(Object objArr ) {
		System.out.println("OBJ Array");
	}
	public static void main(String[] args) {
		char[] num = {'a','b','c'};
		//test(null);
		//test(num);
	}
}
	
	


