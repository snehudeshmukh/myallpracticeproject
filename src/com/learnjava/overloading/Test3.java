package com.learnjava.overloading;
class X {
	static void m1(Object a) { //Type of parameter changed
		System.out.println("I am in M! A Class");
	}
}
	class Z extends X {
		static void m1 (Number b) {
			System.out.println("i am in m1-B Class");
		}
	}
	class Y extends Z {
		static void m1 (Integer c) {
			System.out.println("i am in M1-C class");
		}
	}
public class Test3 {
	public static void main(String[] args) {
		Test3 obj= new Test3();
//		Z z = new Y();
//		z.m1(null);
		//obj.m1(null);
	}

}
