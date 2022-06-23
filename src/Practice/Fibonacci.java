package Practice;

public class Fibonacci {
public static void main(String[] args) {
	int firstNo=0,secondNo=1,thirdNo;
	for(int i=1;i<=10;++i) {
		thirdNo=firstNo+secondNo;
		firstNo=secondNo;
		secondNo=thirdNo;
		System.out.println(thirdNo);
	}
	
	
	
}
}
