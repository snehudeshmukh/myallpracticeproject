package Abstraction;

public abstract class ATM {
	int atmId=1234;
	String location ="Dange Chowk";
	static String bankName= "SBI Bank";
	static long balance=1000;
	public ATM () {
		
	}//No-arg Constructor
	public ATM(int atmId, String location) {
		super();
		this.atmId = atmId;
		this.location = location;
	}
public long showBalance(int accNo) {
	return balance;
}
public abstract long withdraw (int amount,int accNo);
} 
