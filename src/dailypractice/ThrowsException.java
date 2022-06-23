package dailypractice;

public class ThrowsException {
	public static void main(String[] args) {
		try {
		m1();
		throw new ArithmeticException("Not divide by 0");
		}
		finally {
			System.out.println("Finally Block");
		}
		
	}
	public static void m1() throws ArithmeticException {
		int b= 30/0;
		System.out.println("Hiii");
		
	}

}
