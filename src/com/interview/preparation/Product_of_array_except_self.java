package com.interview.preparation;

import java.util.Scanner;

public class Product_of_array_except_self {
	
	public static int[] productSelf(int []nums) {
		
		int n=nums.length;
		int [] left = new int[n];
		int [] right = new int[n];
		int [] result = new int [n];
		
		left[0] =1;
		for(int i=1;i<n;i++) {
			left[i] = left[i-1] * nums[i-1];
		}
		
		
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i] = right[i+1] * nums[i+1];
		}

		for(int i=0;i<n;i++) {
			result[i] = left[i] * right[i];
		}
		
		return result;
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
		
		int result[] = productSelf(arr);
		
		for(int product : result) {
			System.out.print(product+" ");
		}
		
		

	}

}
