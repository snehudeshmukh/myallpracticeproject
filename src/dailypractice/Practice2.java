package dailypractice;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		char[] chars= new char[] {'\u0032'};
		String str= new String(chars);
		byte[] bytes= str.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
