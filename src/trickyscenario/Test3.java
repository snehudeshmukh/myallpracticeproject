package trickyscenario;

public class Test3 {
	public static void main(String[] args) {
		Base0 obj= new Base1();
		((Base2) obj).test();//class cast exception occured
	}

}
class Base0{
	public void test() {
		
	}
}
class Base1 extends Base0{
	public void test() {
		System.out.println("Base1");
	}
}
class Base2 extends Base0{
	public void test() {
		System.out.println("Base2");
	}
}
