package com.practice2;

import java.util.Scanner;

public class MoveAllZeroes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array elements: ");
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]= arr[i];
				j++;
			}
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}

	}

}
