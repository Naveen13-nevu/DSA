package com.interview.preparation;

import java.util.HashSet;
import java.util.Scanner;

public class LongConsecutive {
	
	public static int longestCons(int arr[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		int maxLength=0; 
		
		for(int num : set) {
			if(!set.contains(num-1)) {
				int current = num;
				int length = 1;
				
				while(set.contains(current + 1)) {
					current++;
					length++;
				}
				if(length>maxLength) {
					maxLength = length;
				}
			}
		}
		
		
		return maxLength;
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
		
		int result = longestCons(arr);
		System.out.println(result);
	}

}
