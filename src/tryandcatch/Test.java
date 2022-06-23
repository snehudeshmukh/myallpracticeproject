package tryandcatch;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		try {
			int b= 30/0;
		}
		catch (ArithmeticException e){
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
		System.out.println("Main Method ended");
	}

}
