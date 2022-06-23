package Interface;

public class Test {
	public static void main(String[] args) {
//		Shape obj = new Triangle();// Using Child class object created of interface
//		obj.area();
//		obj.draw();
		Shape square = new Shape() {

			@Override
			public void draw() {
				System.out.println("Drawing Square");
			}

			@Override
			public int area() {
				System.out.println("Calculating Area of Square");
				return 0;
			}
			
		};
		
		square.draw();
		square.area();
	}
}

