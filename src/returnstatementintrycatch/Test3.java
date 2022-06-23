package returnstatementintrycatch;

public class Test3 {
	public static void main(String[] args) {
		Test3 t1= new Test3();
		System.out.println("Return value:"+t1.m1());
	}
	int m1() {
try {
	System.out.println("I am in try block");//exception not accured catch block mdhe janar nhi
	return 20;
	
}
catch(Exception e) {
	System.out.println("I am in catch block");
	return 50;
}

		
	}

}
