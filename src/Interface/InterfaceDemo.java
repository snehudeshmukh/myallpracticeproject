package Interface;

public class InterfaceDemo extends Abc
{

	@Override
	public void eat() {
System.out.println("Implementing eat() Method");		
	}
public static void main(String[] args) {
	InterfaceDemo a1 = new InterfaceDemo();
	a1.print();
	a1.draw();
	a1.eat();
}
}
