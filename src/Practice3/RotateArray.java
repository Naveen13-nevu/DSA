package Practice3;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		
		int n = arr.length;
		int k=2;
		
		for(int i=n-k;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n-k;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
