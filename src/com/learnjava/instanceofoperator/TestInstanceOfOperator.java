package com.learnjava.instanceofoperator;

import java.util.Arrays;

public class TestInstanceOfOperator {
	public static void main(String[] args) {
		Student s1 = new Student("Ram",10,"Pune");
		String std1= "AAA";
		Student s2 = new Student("Sham",20,"Nagpur");
		String std2 = "BBB";
		Student s3 = new Student("Snehal",30,"Kolhapur");
		String std3 = "CCC";
		Object o[]= {std3,s1,std2,s2,s3,std1};
		System.out.println(Arrays.toString(o));
		
		for(Object n:o) {
			if(n instanceof Student)
			System.out.println(n);
				
		}
	}

}
