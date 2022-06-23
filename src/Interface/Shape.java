package Interface;

public interface Shape {
	public void draw();
	public int area();

}
class Triangle implements Shape 
{

	@Override
	public void draw() {
System.out.println("Drawing Triangle!!");		
	}

	@Override
	public int area() {
		System.out.println("Calculating Area Of Triangle!!");
		return 0;
	}
	
}

