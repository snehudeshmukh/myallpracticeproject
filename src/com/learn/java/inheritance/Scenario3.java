package com.learn.java.inheritance;
class XX {
	int x=20;
	int y=30;
	void msg1() {
		System.out.println("Method msg1 in class AA");
	}
	void msg2() {
		System.out.println("Method msg2 in class AA");
	}
}
class YY extends XX{
	int y=50;
	int z=60;
	void msg2() {
		System.out.println("Method msg2 in class BB");
	}
	void msg3() {
		System.out.println("Method msg3 in class BB");
	}
}
public class Scenario3 {
public static void main(String[] args) {
	XX a= new YY();//object ahe child cha reference parent class cha
	System.out.println("Value of X is"+a.x);
	System.out.println("Value of y is"+a.y);
	//System.out.println("Value of z is"+a.z);//reference class XX not present in class XX error
	a.msg1();
	a.msg2();//overriding rule jyacha object tyachi method call Class YY chi
	//a.msg3();//not overrride this method then refrence is class XX this method not present in class XX so error
}
}
