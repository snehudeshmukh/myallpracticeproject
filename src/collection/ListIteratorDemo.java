package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ListIteratorDemo {
public static void main(String[] args) {
	ArrayList al1= new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	Iterator itr= al1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	for(Object a:al1) {
		System.out.println(a);
	}
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	ListIterator listltr = al1.listIterator();
	while(listltr.hasNext()) {
		System.out.println(listltr.next());
		System.out.println(listltr.nextIndex());
	}
	
}
}
