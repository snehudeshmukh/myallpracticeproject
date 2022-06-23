package Abstraction;

public class TestAbstraction {
	public static void main(String[] args) {
		AtmWithdraw s1=new AtmWithdraw ();
		System.out.println(s1.atmId);
		System.out.println(s1.location);
		long bal = s1.showBalance(5678);
		System.out.println("initial balance:"+bal);
		long remainingBal=s1.withdraw(100,5678);
		System.out.println("Remaining Balance:"+remainingBal);
		
	}

}
