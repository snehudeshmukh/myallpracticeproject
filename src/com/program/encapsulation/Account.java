package com.program.encapsulation;

public class Account {
	private long accNo;
	private String name;
	private float amount;
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo (long accNo) {
		this.accNo= accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount=amount;
	}
}
