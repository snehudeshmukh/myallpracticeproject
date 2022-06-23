package dailypractice;
abstract class AbstractInstanceMethod {

	public void getInstance() {
		System.out.println("hii");
	}
}
 public class Instance extends AbstractInstanceMethod
 {
	 public static void main(String[] args) {
		
	
	Instance a=new Instance();
	a.getInstance();
 }
}
