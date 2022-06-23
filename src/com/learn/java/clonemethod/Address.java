package com.learn.java.clonemethod;

public class Address {
	String city;
	String state;
	int pinCode;
	
	Address(){
		
	}
	Address(String city, String state,int pinCode){
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	

}
