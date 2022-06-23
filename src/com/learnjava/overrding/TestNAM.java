package com.learnjava.overrding;
class Q {
	synchronized void m1() {
		System.out.println("m1-Q Class");
	}
	 void m2(char c) {
		System.out.println("m2-Q Class");
	}
}
public class TestNAM extends Q {
public final void m1() {
	System.out.println("m1-TestNAm Class");
}
 synchronized void m2(char c) {
System.out.println("m2-TestNAM Class");	
}
public static void main(String[] args) {
	Q b=new TestNAM();
	b.m1();
	Q c= new Q(); 
	c.m2('a');

}
}