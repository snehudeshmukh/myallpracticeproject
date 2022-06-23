package com.learnjava.overrding;

class G {
	void m1(Number n) {
		System.out.println("m1-G Class");
	}
}
	class H extends G {
		void m1(double d) {
			System.out.println("m1-H Class");
		}
	}
public class F {
public static void main(String[] args) {
	H g= new H();
	g.m1(1);
	g.m1(null);
}
}
