package dailypractice;

import java.util.Arrays;

public class MyPro {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6};
	    int[] b = new int[]{1,2,3,4,5,7};
       boolean arr = Arrays.equals(a,b); 
       
	   System.out.println(arr);
	}

}