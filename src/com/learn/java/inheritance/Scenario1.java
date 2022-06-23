package com.learn.java.inheritance;
class AA {
	int x=20;
	int y=30;
	void msg1() {
		System.out.println("Method msg1 in class AA");
	}
	void msg2() {
		System.out.println("Method msg2 in class AA");
	}
}
class BB extends AA{
	int y=50;
	int z=60;
	void msg2() {
		System.out.println("Method msg2 in class BB");
	}
	void msg3() {
		System.out.println("Method msg3 in class BB");
	}
}
public class Scenario1 {
	public static void main(String[] args) {
		AA a= new AA();//a is reference of class AA and pointing to object of class AA.therefore only eligible to call only AA class variable/methods
		System.out.println("Value of Y:"+a.y);
		System.out.println("Value of x:"+a.x);
	//System.out.println("Value of z:"+a.z);//not call not present class AA
	a.msg1();
	a.msg2();
	//a.msg3();//not call not present in parent class AA
	}
}
