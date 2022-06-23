package com.learnjava.overloading;
class F {
	void m1(A a) { 
		System.out.println("I am in M! A Class");
	}
}
	class G extends F {
		void m1 (A a) {
			System.out.println("i am in m1-B Class");// overriding example with same parameter of method type same
		}
	}
	class H extends G {
		void m1 (A a) {
			System.out.println("i am in M1-C class");
		}
	}
public class Test4 {
	public static void main(String[] args) {
		F a= new G();
		a.m1(null);
	}
}


