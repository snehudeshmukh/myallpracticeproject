package trickyscenario;

public class Test {
public static void main(String[] args) {
	methodOfA();
}
	public static int methodOfA() {
		return (true ? null : 0);//NPE occured
	}
}

