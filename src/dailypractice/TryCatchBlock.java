package dailypractice;

public class TryCatchBlock {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		try {
			
			int b=30/0;
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Not Divisible by 0");
			
		}
		try {
			System.out.println(num[5]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception");
			
		}
		finally {
			System.out.println("Clean All Resources");
		}
	}

}
