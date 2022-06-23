package com.learn.java.clonemethod;

public class Student implements Cloneable {
	String name;
	int rollNo;
	Address address;
	Student(){
		
	}
	Student(String name,int rollNo,Address addr){
		this.name=name;
		this.rollNo=rollNo;
		this.address=addr;
	}
	public String toString() {
		return this.name+" "+this.rollNo+" " +this.address;
	}
	public static void main(String[] args)throws CloneNotSupportedException {
		Address a1=new Address("Pune","Maharastra",412305);
		Student s1=new Student("Ram",10,a1);
		System.out.println("before s1:"+s1);
		Student s2 = (Student)s1.clone();
		System.out.println("before s2:"+s2);
		
		System.out.println(">>>>>>>>>>>>>Chaning address of s1<<<<<<<<<<<<");
		s1.address.city="Mumbai";
		System.out.println("After S1:"+s1);
		System.out.println("After S2:"+s2);
		
	}

}
