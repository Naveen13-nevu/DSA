package rupenet;

import java.util.Scanner;

public class InsertionSort {

	public static void insert(int arr[]) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array element: ");
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		insert(arr);
		for(int n: arr) {
			System.out.print(n+" ");
		}
	}

}
