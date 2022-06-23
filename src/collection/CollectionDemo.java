package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(60);
		System.out.println(al1);
//		al1.clear();//remove all elements 
//		System.out.println(al1);
		System.out.println(al1.contains(10));
		ArrayList al2= new ArrayList();
		al2.add(10);
		al2.add(20);
		//System.out.println(al1.containsAll(al2));//pass null then null pointer exception yenar
		System.out.println(al1.equals(al2));
		//System.out.println(al1.hashCode());
		//System.out.println(al2.isEmpty());
		//System.out.println(al1.remove(4));//out of index then index out of bounds exception
		//System.out.println(al1);
//		System.out.println(al1.removeAll(al2));
//		System.out.println(al1);
//		System.out.println(al1.retainAll(al2));
		System.out.println(al1.size());
		Object[] arr=al1.toArray();
		//System.out.println(Arrays.toString(arr));//all navachya method null pass then NPE
	
}
}