package com.learn.java.objectmethod;

public class GetClassDemo {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("Class of Obj:"+obj.getClass());
		String obj2 = new String();
		System.out.println("Class of Obj2:" +obj2.getClass());
	}

}
