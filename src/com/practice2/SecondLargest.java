package com.practice2;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array element: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the array element ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = arr[0];
		int second =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second && arr[i]!=first) {
				arr[i] = second;
			}
		}
		System.out.println("the second largest element is : "+second);

	}

}
