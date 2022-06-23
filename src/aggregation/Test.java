package aggregation;

public class Test {
	public static void main(String[] args) {
	Engine e1 = new Engine("v-12",2.0f);
	Engine e2 = new Engine ("v-6",1.2f);
	Car car1 = new Car("sedan","Tata",e1);//passed by ref=company//passed by ref= engine
	Car car2 =new Car ("sadan","mahindra",e2);
	// System.out.println(car1.type);
	/*
	 * System.out.println(car1.company); System.out.println(car1.engine.capacity);
	 * System.out.println(car1.engine.type); System.out.println(car2.type);
	 * System.out.println(car2.company); System.out.println(car2.engine.type);
	 * System.out.println(car2.engine.capacity);
	 */
	System.out.println(car1);
	System.out.println(car2);
	}

}

 