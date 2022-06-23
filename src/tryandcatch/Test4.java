package tryandcatch;

public class Test4 {
public static void main(String[] args) {
	try {
		int data1=50/0;
	}
//catch(ArithmeticException e) {
//		System.out.println("Arithmetic");
//	}
	catch(ArithmeticException e) {
		int data2=50/0;//ethe exception yenar try madhla handled by exception/try block only used for handle exception
		System.out.println("Exception");
	}
	catch(Exception e) {
		System.out.println("Hii");
	}
	
	System.out.println("rest of the code");
}
}
