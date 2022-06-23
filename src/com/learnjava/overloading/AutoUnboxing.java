package com.learnjava.overloading;

public class AutoUnboxing {
	public static void box (long i) {
		System.out.println("Autounboxing Done");
	}
public static void main(String[] args) {
	Integer i= 20;
	box(i);
}
}
