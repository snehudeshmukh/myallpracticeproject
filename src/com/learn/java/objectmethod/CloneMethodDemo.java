package com.learn.java.objectmethod;

public class CloneMethodDemo implements Cloneable {
	int rollno;
	String name;
	CloneMethodDemo() {
		
	}
	CloneMethodDemo(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return this.rollno+" "+this.name;
	}
	public static void main(String[] args) throws CloneNotSupportedException  {
		CloneMethodDemo a= new CloneMethodDemo(10,"Ram");
		CloneMethodDemo b=(CloneMethodDemo )a.clone();
		System.out.println(a);
		System.out.println(b);
		
	}

	

}
