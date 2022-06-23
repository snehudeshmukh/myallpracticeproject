package com.program.encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account s1= new Account();
		s1.setAccNo(123456789);
		s1.setName("Snehal Deshmukh");
		s1.setAmount(12345.50f);
		
		System.out.println("Account Number:"+ s1.getAccNo());
		System.out.println("Name:"+ s1.getName());
		System.out.println("Amount:"+ s1.getAmount());
	}
	

}
