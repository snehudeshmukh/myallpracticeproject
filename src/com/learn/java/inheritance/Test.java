package com.learn.java.inheritance;
class P {
	int a=30;
	int x=45;
}
class Q extends P {
	int a=50;
	//int x=25;
}
public class Test {
public static void main(String[] args) {
	Q q = new Q();//jyacha reference tyach instance variable call honar
	System.out.println("Value of a:"+q.a);
	System.out.println("Value of a:"+q.x);
	P p = new Q();
	System.out.println("Value of a:"+p.a);
}
}

