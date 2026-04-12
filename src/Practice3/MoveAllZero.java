package Practice3;

import java.util.Scanner;

public class MoveAllZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the array element: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int j=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		
		while(j<arr.length) {
			arr[j] =0;
			j++;
		}
		
		for(int n: arr) {
			System.out.print(n+" ");
		}

	}

}
