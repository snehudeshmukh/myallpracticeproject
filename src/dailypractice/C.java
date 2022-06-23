package dailypractice;
class 
{
	static int i=1111;
	static
	{
		i=i++ + ++i;
	}
}
class B extends A
{
	static
	{
		i=--i - i--;
	}
	{
		i=++i + i++;
	}
}
public class C {
public static void main(String[] args) {
	B b=new B();
	System.out.println(b.i);
}
}
