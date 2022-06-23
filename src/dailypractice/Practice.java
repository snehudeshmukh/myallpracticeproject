package dailypractice;

import com.learnjava.overrding.Test1;

public class Practice {
	private void m1() {
		System.out.println("M1-class Test");
		}
		public static void main(String[] args) {
				Practice a= new Practice();
				a.m1();
			
			}
		}
			class Test extends Practice {
			private void m1() {
			System.out.println("M1-class B");
						
					

}
}