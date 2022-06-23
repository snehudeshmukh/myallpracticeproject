package com.learnjava.overloading;

public class overloaded {
	public static void msg (int a,long b) {
		System.out.println("Hello");
	}
	public static void msg(long a,int b) {
		System.out.println("Hiiiii!!!");
	}
	public static void msg(long a, long b) {
		System.out.println("Hey!!!");
	}
public static void main(String[] args) {
	Integer i =10;
	//msg(10l,12);
	//msg(10,12);
//msg(10l,12l);
	//msg(i,20);
}
}
