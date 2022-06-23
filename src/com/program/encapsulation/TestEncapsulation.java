package com.program.encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Snehal");
		e1.setEmployeeId(112);
		System.out.println("Employee Name:"+e1.getName());
		System.out.println("Employee Id:"+e1.getEmployeeId());
		
	}

}

