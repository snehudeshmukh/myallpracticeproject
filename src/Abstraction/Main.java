package Abstraction;

public class Main {
public static void main(String[] args) {
	StudentInfo s1= new StudentInfo();
	System.out.println(s1.roll);
	System.out.println(s1.name);
	s1.printStudentInfo();
	StudentInfo s2= new StudentInfo(10,"Ram");
	System.out.println(s2.roll);
	System.out.println(s2.name);
}
}