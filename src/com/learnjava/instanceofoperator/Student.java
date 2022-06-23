package com.learnjava.instanceofoperator;

public class Student {
	String name;
	int rollNo;
	String city;
	Student(){
		
	}
public Student(String name,int rollNo,String city) {
this.name=name;
this.rollNo=rollNo;
this.city=city;
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollNo=" + rollNo + ", city=" + city + "]";
}

}

