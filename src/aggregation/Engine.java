package aggregation;

public class Engine {
	String type;
	float capacity;
	public Engine() {
		super();
	}
	public Engine(String type, float capacity) {
		super();
		this.type = type;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + "]";
	}
	
}