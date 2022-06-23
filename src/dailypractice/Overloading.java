package dailypractice;

public class Overloading {
void m1(A a)
{
	System.out.println("Hello A");
}
void m1(B b)
{
	System.out.println("Hello b");
}
void m1(C c)
{
	System.out.println("Hello c");
}
public static void main(String[] args) {
	Overloading o=new Overloading();
	//o.m1(null);
}
}
