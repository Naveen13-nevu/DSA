package com.practice2;

import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		boolean isPalindrome = true;
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			if(arr[left] != arr[right]) {
				isPalindrome = false;
			}
			
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println( " is a palindrome");
		}
		else {
			System.out.println( " is not a palindrome");
		}
		sc.close();
	}

}
