package com.interview.preparation;

import java.util.Scanner;

public class TrappingWater {

public static int trapping(int []height) {
		
		int n = height.length;
		
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = height[0];
		for(int i=1;i<n;i++) {
			if(left[i-1]>height[i]) {
				
				left[i] = left[i-1];
			}
			else {
				left[i] = height[i];
			}
		}
		
		right[n-1] = height[n-1];
		for(int i=n-2;i>=0;i--) {
			if(right[i+1]>height[i]) {
				right[i] = right[i+1];
			}
			else {
				right[i] = height[i];
			}
		}
		
		
		int water =0;
		for(int i=0;i<n;i++) {
			int min;
			if(left[i]<right[i]) {
				min = left[i];
			}
			else {
				min = right[i];
			}
			water = water+(min - height[i]);
		}
		return water;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array element: ");
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = trapping(arr);
		System.out.println(result);
		 
		
	}
}
