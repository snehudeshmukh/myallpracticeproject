package Interface;
interface Bank {
	float rateOfInterest();
}
class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 7.2f;
	}
}
	class PNB implements Bank {

		@Override
		public float rateOfInterest() {
			return 9.2f;
		}
		
	}
public class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		b.rateOfInterest();
		System.out.println("Rate Of Interest of SBI" +b.rateOfInterest());
		
	}

}
