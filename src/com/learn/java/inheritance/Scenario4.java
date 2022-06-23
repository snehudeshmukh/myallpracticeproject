package com.learn.java.inheritance;

class NN {
	int x=20;
	int y=30;
	void msg1() {
		System.out.println("Method msg1 in class AA");
	}
	void msg2() {
		System.out.println("Method msg2 in class AA");
	}
}
class MM extends NN{
	int y=50;
	int z=60;
	void msg2() {
		System.out.println("Method msg2 in class BB");
	}
	void msg3() {
		System.out.println("Method msg3 in class BB");
	}
}
public class Scenario4 {
	public static void main(String[] args) {
		NN n= new NN();
		MM m= new MM();
		n=m;//in this situation depends aapan refrence kay pass kartoy jyacha refrence tya method call honar
		System.out.println("Value of x is:"+m.x);
		System.out.println("Value of x is:"+m.y);
		System.out.println("Value of x is:"+m.z);
		m.msg1();
		m.msg2();
		m.msg3();
		System.out.println("Value of x is:"+n.x);
		System.out.println("Value of x is:"+n.y);
		//System.out.println("Value of x is:"+n.z);
		n.msg1();
		n.msg2();
		//n.msg3()//not present in class NN
	}

}
