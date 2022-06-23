package dailypractice;

public class ReverseOfString {
public static void main(String[] args) {
	String s1="abcde";
	StringBuffer s2=new StringBuffer();
	s2.append(s1);
	s2.reverse();
	System.out.println(s2);
}
}
