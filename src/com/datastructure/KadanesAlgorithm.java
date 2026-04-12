package com.datastructure;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array element: ");
		int arr [] = new int [size];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int max = arr[0];
		int sum = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(sum<0) {
				sum = arr[i];
			}
			else {
				sum = sum+ arr[i];
			}
			if(sum>max) {
				max = sum;
			}
		}
		
		
		System.out.println(max);
	}

}
