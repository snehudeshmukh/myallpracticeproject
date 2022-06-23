package Abstraction;

public abstract class Student {
	int roll;
	String name;
	public Student() {
		super();
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
public abstract void printStudentInfo();
}
