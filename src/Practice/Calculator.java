package Practice;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	int no1=20,no2=30,res=0;
	String symbol="%";

	switch(symbol){
		case "+": res=no1+no2;
		System.out.println("Addition:"+res);
		break;
		case "-": res=no1-no2;
		System.out.println("Sub:"+res);
		break;
		case "*": res=no1*no2;
		System.out.println("Multi:"+res);
		break;
		case "%": res=no1%no2;
		System.out.println("Division:"+res);
		break;
		default :
			System.out.println("Invalid Input");
			break;
		
	}


}
}