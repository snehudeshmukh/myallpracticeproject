package com.learnjava.overrding;

public class Override1 {
	public static void main(String[] args) {
		Draw s=new Draw();
		//s.shape();
	}

}
class Shape {
private  void shape() {
		System.out.println("Shape");
	}
}
class Draw extends Shape {
private  void shape() {
	System.out.println("Draw");
}
	
	}
