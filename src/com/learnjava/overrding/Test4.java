package com.learnjava.overrding;

class P {
	strictfp void method(int a) {
		System.out.println("One");
	}
	strictfp void method (double b) {
		System.out.println("Two");
	}
}
class O extends P {
	void method (double b) {
		System.out.println("Three");
	}
}
public class Test4 {
	public static void main(String[] args) {
		P p = new O();
		p.method(20);
	}

}
