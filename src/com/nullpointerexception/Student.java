package com.nullpointerexception;

public class Student {
	String name;
	int rollNo;
	
	Student(){
		
	}
public Student(String name,int roll) {
	this.name=name;
	this.rollNo=roll;
}
public static void main(String[] args) {
	Student s1=new Student("Ram",10);
	System.out.println(s1.name);
	System.out.println(s1.rollNo);
	Student s2 = null;//we can defined object as a null it is valid but not perform any operation on that object
	System.out.println(s2.name);//null pointer exception show here
	System.out.println(s2.rollNo);
}

}
