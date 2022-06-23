package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
	public static void main(String[] args) {
ArrayList st= new ArrayList();
st.add(30);
st.add(40);
st.add(50);
st.add(60);
st.add(30);
System.out.println(st.get(2));//Index out of bounds exception if index 
System.out.println(st.indexOf(50));
System.out.println(st.lastIndexOf(30));
System.out.println(st.indexOf(10));
System.out.println(st.set(2, 10));//Index of bounds exception
System.out.println(st);
System.out.println(st.subList(1, 3));


}
}