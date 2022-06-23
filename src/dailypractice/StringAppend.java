package dailypractice;

public class StringAppend {

	public static void main(String[] args) {
		String s1 = new String("B");
		String s4 = new String("BA");
		StringBuffer s2 = new StringBuffer("P");
		StringBuilder s3 = new StringBuilder("XYZAS");
		
		System.out.println(s4.compareTo(s1));
		System.out.println(s3.capacity());
		s3.trimToSize();
		
		System.out.println(s3.length());
		System.out.println(s3.capacity());

		
	}

}
