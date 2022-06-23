package returnstatementintrycatch;

public class Test6 {
public static void main(String[] args) {
	System.out.println(m1());
}
static int m1() {
try {
	System.out.println("I am in try block");
	int a=30/0;
}
catch(ArithmeticException e) {
	System.out.println("inside catch block");
	return 50;
}
finally {
	System.out.println("inside finally block");
	return 100;//finally chi value always return karto

}
//System.out.println("Hii");unreachable code
}
}