package Practice;

public class TwoSwapTwoVariable {
public static void main(String[] args) {
	int a=30,b=40;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a"+a);
	System.out.println("b"+b);
}
}
