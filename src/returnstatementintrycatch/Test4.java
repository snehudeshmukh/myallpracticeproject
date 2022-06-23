package returnstatementintrycatch;

public class Test4 {
public static void main(String[] args) {
	Test4 t1= new Test4();
	System.out.println("Return value:"+t1.m1());
}
int m1() {
try {
System.out.println("I am in try block");//exception not accured catch block mdhe janar nhi

}
catch(Exception e) {
System.out.println("I am in catch block");
return 50;
}
return 100;//exception not accured in try block catch mdhe janar nhi
}
}