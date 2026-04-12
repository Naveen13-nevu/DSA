package com.interview.preparation;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementUsingStack {

	public static int []nextGreater(int [] arr){
		
		int n = arr.length;
		int result[]=new int[n];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=n-1;i>=0;i--) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				result[i] = -1;
			}
			else {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
		return  result;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		
		System.out.println("Enter the array element: ");
		int arr[] = new int [size];
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result[] = nextGreater(arr);
		
		for(int greater : result) {
			System.out.print(greater+" ");
		}
		
	}

}
