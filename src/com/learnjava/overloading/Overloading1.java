package com.learnjava.overloading;

public class Overloading1 {
	public static void addition (int a) {
		System.out.println("Print Addition int a Method:" +a);
	}
public static void addition(int a,int b) {
	System.out.println("Print Addition inta int b Method:" +(a+b));
}
			
public static void addition(int a, int b, int c) {
	System.out.println("Addition int a int b int c Method:"+ (a+b+c));
} 
public static void main(String[] args) {
	addition(10,20,30);
}
	
}
