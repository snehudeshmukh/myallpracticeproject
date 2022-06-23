package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayMethodDemo {
	public static void main(String[] args) {
	ArrayList al1= new ArrayList();
	al1.add("abc");
	al1.add("def");
	al1.add("xyz");
		System.out.println(al1);
		Object[] arr = new String[3]; 
				arr= al1.toArray(arr);
System.out.println(Arrays.toString(arr));
}
}