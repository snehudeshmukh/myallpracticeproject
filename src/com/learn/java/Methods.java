package com.learn.java;

public class Methods {
	public static void main(String[] args) {
	int result=addition(10,20);
	System.out.println("Addition result"+result);
	int arr[]= {1,2,3,4,5,6,7,8};
	array(arr);
	}
public static int addition(int a,int b) {
	System.out.println("Addition Method Started");
	int sum=a+b;
	System.out.println("Addition Method Ended");
	return sum;	
}
public static void array (int a[]) {
	System.out.println("array Method Started");
	int c[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
	System.out.println(c[i]+ " ");
	}
	System.out.println("array Method Ended");
	multiplication(12,2);
}
public static void multiplication(int a,int b) {
	System.out.println("Multiplication Method Started");
	int mul=a*b;
	System.out.println("Multiplication Result:"+mul);
	System.out.println("Multiplication Method Ended");
	print();
}
public static void print() {
	System.out.println("Print Method Started");
	System.out.println("Print Method Ended");
	
}
}