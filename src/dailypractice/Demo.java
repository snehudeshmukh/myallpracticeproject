package dailypractice;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Demo {

//	static Object getCapacity(List al) throws Exception{
//		Field field = ArrayList.class.getDeclaredField("elementData");
//		field.setAccessible(true);
//		return((Object[])field.get(al)).length;
//	}
	public static void main(String[] args) throws Exception {
		
	ArrayList al1= new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	System.out.println(al1);
//	al1.clear();
//	System.out.println("After Clear Method:"+al1);
	System.out.println(al1.contains(20));
	System.out.println(al1.contains(15));
	System.out.println(al1.containsAll(al1));
	ArrayList al2= new ArrayList();
	al2.add(40);
	al2.add(50);
	System.out.println(al1.equals(al2));
	System.out.println(al1.hashCode());
	System.out.println(al2.hashCode());
	System.out.println(al1.isEmpty());
	System.out.println(al2.remove(1));
	System.out.println(al2);
	System.out.println(al1.removeAll(al1));
	System.out.println(al1);
}
}

