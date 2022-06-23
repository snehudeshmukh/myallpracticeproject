package tryandcatch;

public class IntScenario1 {
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6};
		try {
			int res=num[5]/0;//1st check RHS value num[5] 1st check manun array exception show
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
