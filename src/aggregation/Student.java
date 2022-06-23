package aggregation;

public class Student {
	int rollNo;
	String name;
	Address address;
	public Student() {
		super();
	}
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	

}
