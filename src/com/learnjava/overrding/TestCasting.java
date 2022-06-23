package com.learnjava.overrding;

class X {
	void draw (int a,float b) throws Throwable {
		System.out.println("Circle");
	}
}
class Y extends X {
	void draw (int a, float b) {
		System.out.println("Rectangle");
	}
}
class Z extends Y  {
	void draw(int a, float b) throws ArithmeticException {
		System.out.println("Square");
	}
}
public class TestCasting {
public static void main(String[] args) throws Throwable{
	X x= new Z();
	x.draw(20,9.5f);
	Y y = (Y)x;
	y.draw(10,20f);
	//Z z=(Z)y;
	//z.draw(30, 10.5f);// we cannot casted run time object Y is run time object error ClassCastException
	Y a =new Z();
	a.draw(16,17f);
	Z z = (Z)a;
	z.draw(14, 14.5f);
}
}
