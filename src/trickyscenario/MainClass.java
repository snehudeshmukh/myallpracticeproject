package trickyscenario;

public class MainClass {
public static void main(String[] args) {
	A a= null;
	a.staticMethod();
}
}
class A {
	static void staticMethod() {
		System.out.println("Static Method");
	}
}