package dailypractice;

public class StringMethodDemo {
	public static void main(String[] args) {
		
	
	String s1 = new String("Programming Wings Java 7");
	String s2 = new String("Programming Wings Java 7");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	String s3 = s1.intern();
	String s4 = s2.intern();
	
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	}
}
