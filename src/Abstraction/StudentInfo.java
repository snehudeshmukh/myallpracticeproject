package Abstraction;

public class StudentInfo extends Student {
	public StudentInfo() {
		super();
		System.out.println("Inside no args of StudentInfo");
	}
	public StudentInfo(int roll,String name) {
		super(roll,name);
	}
	@Override
	public void printStudentInfo() {
System.out.println("Inside Print Method");		
	}
	
	}


