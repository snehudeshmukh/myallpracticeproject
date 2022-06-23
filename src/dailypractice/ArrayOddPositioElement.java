package dailypractice;

public class ArrayOddPositioElement {
public static void main(String[] args) {
	int arr[]= {1,5,6,3,8,9,10,35,17,18};
	for(int i=0;i<arr.length;i++) {
		if(i%2!=0) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
