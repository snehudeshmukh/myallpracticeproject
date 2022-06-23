package com.nullpointerexception;

public class NullPointer {
	public  void test() {
		System.out.println("Test");
	}
public static void main(String[] args) {
	NullPointer obj = null;//if both method is static no need of object no null exception
	obj.test();//here null pointer exception accured if method is not static
}
}
