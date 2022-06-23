package Abstraction;

public class AtmWithdraw extends ATM {

	@Override
	public long withdraw(int amount, int accNo) {
		System.out.println("Inside withdraw method of ATM in ATMwithdraw");
		balance=balance-amount;
		return balance;
	}

	}
	

