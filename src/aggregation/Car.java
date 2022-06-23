package aggregation;

public class Car {
	String type;
	String company;
	Engine engine;
	public Car() {
		super();
	}
	public Car(String type, String company, Engine engine) {
		super();
		this.type = type;
		this.company = company;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", company=" + company + ", engine=" + engine + "]";
	}
	
	

}
