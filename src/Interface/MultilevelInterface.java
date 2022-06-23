package Interface;

public interface MultilevelInterface {
	public void print();
	public void draw();
	
}
abstract class Abc implements MultilevelInterface {

	@Override
	public void print() {
System.out.println("Implementing print()method");		
	}

	@Override
	public void draw() {
System.out.println("Implementing draw()Method");		
	}
abstract public void eat();
	
}