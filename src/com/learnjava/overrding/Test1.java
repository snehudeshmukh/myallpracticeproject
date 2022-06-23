package com.learnjava.overrding;

public class Test1 {
private void m1() {
System.out.println("M1-class Test");
}
public static void main(String[] args) {
		Test1 a= new Test1();
		a.m1();
	
	}
}
	class B extends Test1 {
	private void m1() {
	System.out.println("M1-class B");
				
			
		}
	}


