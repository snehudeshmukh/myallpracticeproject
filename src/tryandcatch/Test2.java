package tryandcatch;

public class Test2 {
	public static void main(String[] args) {
	System.out.println("Main Method Started");
	try {
		//System.exit(0);//program direct exit honar exception check karnar nhi
		int b= 30/0;
		System.exit(0);//exception aal then does not execute below line direct exception search karat all program run
	}
	catch (ArithmeticException e){
		//System.exit(0);//line num 12 print honar nhi
		System.out.println("Enter valid Number zero not devidable");
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Exception");
	}
	catch(Exception e) {
		System.out.println("Exception");
	}
	finally {
		System.out.println("the try-catch is finished");
	}
}
}
