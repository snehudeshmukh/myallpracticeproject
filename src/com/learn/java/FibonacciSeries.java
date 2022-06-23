package com.learn.java;

public class FibonacciSeries {
	public static void main(String[] args) {
		int c;
		int a[] = { 2, 3, 4, 12, 7, 9, 10, 13 };
		for (int i = 0; i < a.length - 1; i++) {
			c = a[i] + a[i + 1];
			System.out.println("" + c);
			a[i] = a[i + 1];
			a[i + 1] = c;
		}

	}

}
