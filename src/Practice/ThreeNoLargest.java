package Practice;

public class ThreeNoLargest {
	public static void main(String[] args) {
		int a=30, b=40, c=50;
		if(a>b) {//or(a>b && a>c)
			if(a>c) 
				System.out.println("Greater No is a:"+a);
		}
		if(b>c) {//(b>a && b>c)
			System.out.println("Greater No is b:"+b);
		}
		else
			System.out.println("Greater No is c:"+c);
	}

}
