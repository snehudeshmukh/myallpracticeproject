package returnstatementintrycatch;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1= new Test1();
		System.out.println("Return value:"+t1.m1());
	}
	int m1() {
try {
	System.out.println("I am in try block");
	return 30;//error yenar return type not end of method
	//System.out.println("hello");//here also unreachable
}
catch(Exception e) {
	System.out.println("I am in catch block");//try mdhe return lihal tarr catch mdhe pan lihav lagat nhi tar error
	
}
//return 50;//here return statement pahije end of method exception ala tarach catch block mdhe janar mnun tithe nahi lihu shakat
//System.out.println("Hii");//statement after return unreachable
}
}