package com.learnjava.overloading;

public class VarArgsMethod {
	public static void test (int a) {
		System.out.println("print int value");
	}
	public static void test(Integer b) {
		System.out.println("Print Long Value");
	}
	public static void test(int...arr) {
		System.out.println("Varargs method invoked");
	}
public static void main(String[] args) {
	int num[]= {1,2,3};
//	int i=10;
//	test(i);
	//long num[] = {10l,20l,30l,40l};
	test(num);
			}
}
