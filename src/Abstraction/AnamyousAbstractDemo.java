package Abstraction;

public class AnamyousAbstractDemo {
	public static void main(String[] args) {
		ObjectCreationAbstract obj=new ObjectCreationAbstract () {

			@Override
			public void method1() {
     System.out.println("Inside M1");				
			}
			
		};
		obj.method1();
		obj.method2();
	}
		

}
