package tryandcatch;

public class NestedTryCatch {
	public static void main(String[] args) {
		int a=30;
		try {
			int res=30/0;
			System.out.println("Inside outer try block");
			try {
				System.out.println("Inside inner try block");
				//int res= a/0;
			}
			catch(ArithmeticException e) {
				System.out.println("Inner catch block");
			}
		}
		catch(NullPointerException e){
System.out.println("NPE Exception");			
		}
		catch(ArithmeticException e) {
			System.out.println("Outer catch exception");
		}
	}

}
