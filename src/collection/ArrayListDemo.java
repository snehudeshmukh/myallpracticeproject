package collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo extends ArrayList {
	public static void main(String[] args) {
	ArrayListDemo lst = new ArrayListDemo();
	//lst.ensureCapacity(30);
	lst.add(10);
	lst.add(20);
	lst.add(30);
	lst.add(40);
lst.removeRange(0,3);
System.out.println(lst);
	
}
}
