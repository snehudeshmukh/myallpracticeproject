package dailypractice;

import java.util.Arrays;

public class ReturnStatement {
		public static void main(String[] args) {
			
			System.out.println("Method Returned Value:"+Arrays.toString(method1()));
		}
			public static int[] method1() {
				int value=10;
				int[] arr= {1};
				try {
					System.out.println(arr[4]);
			}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Inside catch Block:"+arr[0]);
				}
				finally {
					arr[0]=2;
					System.out.println("Finally block value:"+arr[0]);
					
				}
				return arr;
		}

	}

