package com.learnjava.overloading;

public class Test {
	public static void test(int[] intArr) {
		System.out.println("int Array");
	}
public static void test(char[] charArr) {
	System.out.println("Char Array");
}
public static void test(long[] longArr) {
	System.out.println("Long Array");
}
public static void main(String[] args) {
	//test(null);
	//int [] nums= {1,2,3,4,5};
	//char[] arr = {'a','b','c','d','e'};
	long [] arr = {10l,20l,30l,40l};
	test(arr);
}
}
