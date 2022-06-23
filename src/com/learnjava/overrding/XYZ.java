package com.learnjava.overrding;

class XY {
	protected Number m1(int a) {
		System.out.println("One");
		return null;
	}
	Object m2 () {
		System.out.println("Two");
		return null;
	}
}
	class YZ extends XY {
		protected String m2() {
			System.out.println("Three");
			return null;
		}
		
	}

public class XYZ {
	public static void main(String[] args) {
		XY a= new YZ();
		a.m1(20);
		a.m2();
	}

}
