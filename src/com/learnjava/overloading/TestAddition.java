package com.learnjava.overloading;

public class TestAddition {
	int result=0;
public void addition (int b,int...a) {
	for (int n:a)
	result +=n;
	System.out.println("Addition of Array:"+result);
	System.out.println(b);
}
public static void main(String[] args) {
	int[] num = {1,2,3,4,5,6};
	TestAddition obj = new TestAddition();
	obj.addition(10,num);
}
}
