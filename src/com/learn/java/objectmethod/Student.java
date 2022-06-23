package com.learn.java.objectmethod;

public class Student {
	int rollNo;
	String name;
	
	Student(){
		
	}
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	public String toString() {
		return this.name +" "+this.rollNo;//to string method manually return
	}
//	protected void finalize () {
//		System.out.println("Finalize method call");
//	}
public static void main(String[] args) {
	Student s1= new Student(10,"Ram");
	Student s2 = new Student (10,"Ram");
	Student s3 =s2;
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	System.out.println(s2.equals(s1));
	System.out.println(s3.equals(s2));
	s1=null;
	System.gc();
	System.out.println("end of garbage collection");
	System.out.println("Class of s2:" +s2.getClass());
}
	protected void finalize () {
		System.out.println("Finalize method call");
	}
	
}

	
