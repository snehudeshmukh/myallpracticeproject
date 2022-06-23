package com.learnjava.overloading;

public class Overloading3 {
	public void test(Object obj,Integer i) {
		System.out.println("Object, Integer");
	}
	public void test (Integer i,Integer j) {
		System.out.println("Integer,Integer");
	}
	public void test(Object obj,String str) {
		System.out.println("Object - String");
	}
	public void test (StringBuffer buf, Object obj) {
		System.out.println("StringBuffer, Object");
	}
	public void test (Object obj1, Object obj) {
		System.out.println("Object, Object");
	}
	public static void main(String[] args) {
		Overloading3 obj = new Overloading3();
		//obj.test(null, null);
		obj.test("ram",10);
		Long s1=10l,s2=20l;
		obj.test(s1,s2);
		
	}

}
