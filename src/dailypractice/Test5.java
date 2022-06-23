package dailypractice;


public class Test5 {
		public static void main(String[] args) {
			Test5 t1= new Test5();
			System.out.println("Return value:"+t1.m1());
		}
		int m1() {
	try {
		System.out.println("I am in try block");
		int b=30/0;
		return 20;
		
	}
	catch(ArithmeticException e) {
		System.out.println("I am in catch block");
		return 50;
	}
	finally {
		System.out.println("inside finally block");
		
	
		}
}
}
