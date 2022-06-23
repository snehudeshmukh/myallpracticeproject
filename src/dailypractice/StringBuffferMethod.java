package dailypractice;

public class StringBuffferMethod {
	public static void main(String[] args) {
		String s1="abcd";
		StringBuffer str= new StringBuffer(s1);
		str.reverse();
		String s2=str.toString();
		if (s1.equals(s2)) {
			System.out.println("given String is palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
	

}

