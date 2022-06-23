package tryandcatch;

public class IntScenario2 {
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6};
		try {
			num[7]=30/0;//1st check RHS value 30/0 1st check manun arithmetic exception show
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception");
		}
		catch (ArithmeticException e){
			System.out.println("Arithmetic");
		}
		
		catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
