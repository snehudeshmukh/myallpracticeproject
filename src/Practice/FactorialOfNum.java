package Practice;

public class FactorialOfNum {
public static void main(String[] args) {
	int n=6;
	int res=1;
	for(int i=1;i<=6;i++) {
		
		res*=i;
	}
	System.out.println("Factorial of num is:"+res);
}
}
