package com.learn.java.inheritance;
class A {
	int x=20;
	void msg() {
		System.out.println("Class A Method");
	}
}
class B extends A {
	int x=50;
	int y=100;
	void msg() {
		System.out.println("Class B Method");
	}
	void msg2() {
		System.out.println("Class B Method 2");
	}
}
public class Test1 {
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println("Value of x:"+b.x);//class B reference class b varible output
		b.msg();
		b.msg2();
		A a= new B();
		System.out.println("Value of a:"+a.x);//reference of Class A class A variable output
		//System.out.println("Value of Y:"+a.y);//Variable y not present in Class A error
		a.msg();//this method override in Class B in overriding rule object jyacha method call honar
		//a.msg2();//method not present in Class A
		
	}

}
