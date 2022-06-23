package com.learn.java;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,5 };
	removeDuplicateFromArray(arr);
	}

	public static void removeDuplicateFromArray(int num[]) {
		int a = 0;
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] != num[i + 1]) {
				num[a++]=num[i];
			}
		}
		num[a++] = num[num.length - 1];
		System.out.println("Print Array After Duplicate Remove:");
		for(int j=0;j<a;j++) {
			System.out.print(num[j]+ " ");	
		}
}
} 