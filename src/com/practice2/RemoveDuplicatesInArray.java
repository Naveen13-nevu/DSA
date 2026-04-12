package com.practice2;

import java.util.Scanner;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("after removing the duplicate elements: ");
		for(int i=0;i<arr.length;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
