package Interface;
interface Print {
void print();

}
public class Demo implements Print {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
       obj.print();
   	
	}
	}

	


