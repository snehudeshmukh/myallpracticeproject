package Interface;

interface BOM {
	float rateOfInterest();
}
	interface BOI {
		int interest();
	}
	interface BOB {
		double print ();
	}
class RBIBank implements BOM,BOI,BOB {

	@Override
	public float rateOfInterest() {
		return 7.5f;
	}

	@Override
	public double print() {
		return 6.5d;
	}

	@Override
	public int interest() {
		return 10;
	}
	
}
public class BankMultiple
{
	public static void main(String[] args) {
		RBIBank b1 = new RBIBank();
         b1.rateOfInterest();
         b1.interest();
         b1.print();
      
System.out.println("ROI:" +b1.rateOfInterest());
System.out.println("ROI:" +b1.interest());
System.out.println("ROI:" +b1.print());
	}

}
