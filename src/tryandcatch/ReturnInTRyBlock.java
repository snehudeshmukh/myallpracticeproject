package tryandcatch;

public class ReturnInTRyBlock {
	public static void main(String[] args) {
		System.out.println("Returned Value is:"+m1());
	}

	private static int m1() {
		int value=1;
		try {
		throw new ArrayIndexOutOfBoundsException();
	
	}
		catch(ArrayIndexOutOfBoundsException e) {
		value=2;
			System.out.println("Exception caught valu is:"+value);
			//return value;//finally block not then return 2
		}

		finally {
			value=3;
			System.out.println("Finlly block");
			return value;//retrun 3 value
		}
		//return value;//finally block value return update value of finally block return
		}

}
