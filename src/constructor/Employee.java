package constructor;

public abstract class Employee {
	int id;
	String name;
	public Employee() {
		super();
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
 class EmployeeInfo extends Employee {
	 String address;

	public EmployeeInfo(int id,String name,String address) {
		super(id,name);
		this.address = address;
	}

	
}
