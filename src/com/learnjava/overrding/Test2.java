package com.learnjava.overrding;

class Test {
	private void m1()
{
		System.out.println("m1-Test Class");
		}
}
public class Test2 extends Test{
	private void m1() {
		System.out.println("m1-Test2 Class");
	}
	public static void main(String[] args) {
		Test b = new Test();
		//b.m1();
	}

}
