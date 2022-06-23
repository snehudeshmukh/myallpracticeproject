package returnstatementintrycatch;

public class Test2 {
	public static void main(String[] args) {
		Test2 t1= new Test2();
		System.out.println("Return value:"+t1.m1());
	}
	int m1() {
try {
	System.out.println("I am in try block");
	int x=10/0;
	return 20;
	
}
catch(Exception e) {
	System.out.println("I am in catch block");
	return 50;
}
//return 30;ethe pan lihu shakto 
}
}