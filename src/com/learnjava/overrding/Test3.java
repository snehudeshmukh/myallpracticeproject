package com.learnjava.overrding;

class T {
	protected void m1() {
		System.out.println("M1-Test Class");
	}
}
public class Test3 extends T {
public final void m1() {
	System.out.println("M1-Test3 Class");
}
 static public void main(String[] args) {//we can changed the position of AM & NAM in any method
	T b=new Test3();//but we cannot change position of RT & Method name
	b.m1();
//	T c =new Q();
//	c.m1();
}
}
//class R extends Test3 {
//	public void m1() {
//		System.out.println("m1-R Class");//cannot overrride further final applied method in parent class
//	}
//}
//class Q extends T {
//	public final void m1() {
//		System.out.println("m1-Q Class");//we can apply final to the method this class child of T
//	}

