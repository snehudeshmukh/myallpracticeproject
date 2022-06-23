package Interface;

public class TestMultipleInterface implements Draw, Area {

	@Override
	public void area() {
System.out.println("Print Area Method");		
	}

	@Override
	public void draw() {
System.out.println("Print Draw method");		
	}
	public static void main(String[] args) {
		TestMultipleInterface d1 = new TestMultipleInterface();
		d1.draw();
		d1.area();
	}
	

}
