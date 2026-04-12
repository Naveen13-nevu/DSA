package rupenet;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the array element: ");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum = sum+arr[i];
			}
		}
		System.out.println("sum of even number is " + sum);
		

	}

}
