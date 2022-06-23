package com.learnjava.overloading;
class A {
	void m1(A a) { //Type of parameter changed
		System.out.println("I am in M! A Class");
	}
}
	class B extends A {
		void m1 (B b) {
			System.out.println("i am in m1-B Class");
		}
	}
	class C extends B {
		void m1 (C c) {
			System.out.println("i am in M1-C class");
		}
	}
public class OverloadingScenario {
	public static void main(String[] args) {
		//OverloadingScenario obj = new OverloadingScenario();
		A a=new A();
		a.m1(a);
		B b = new B();
		b.m1(a);
		b.m1(b);//jya class cha reference tya class chi method call honar 
		A ab = new B();//parent hold child 
		ab.m1(ab);
		B bc = new C();
		bc.m1(bc);
	}

}
