package trickyscenario;

	class BaseClass {
		public static void main(String[] args) {
			BaseClass po= new DerivedClass();
			po.foo();
			po.bar();
		}
private void foo() {
	System.out.println("In BaseClass.foo()");
}
void bar() {
	System.out.println("In BaseClass bar()");
}
}
class DerivedClass extends BaseClass{
	void foo() {
		System.out.println("In Derived foo()");
	}
	void bar() {
		System.out.println("In Derived bar()");
	}
}