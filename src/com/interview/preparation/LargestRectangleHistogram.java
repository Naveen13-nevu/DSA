package com.interview.preparation;

import java.util.Stack;

public class LargestRectangleHistogram {
	
	public static int Largest(int [] heights) {
		
		Stack<Integer> stack = new Stack<>();
		int maxArea =0;
		int n = heights.length;
		
		for(int i=0;i<=n;i++) {
			
			int currentHeight;
			
			if(i==n) {
				currentHeight =0;
			}
			else {
				currentHeight = heights[i];
			}
			
			while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
				int height = heights[stack.pop()];
				int width;
				
				if(stack.isEmpty()) {
					width =i;
				}
				else {
					width = i - stack.peek() -1;
			
				}
				int area = width * height;
				
				if(area > maxArea) {
					maxArea = area;
				}
			}
			stack.push(i);
		}
		
		return maxArea;
	}
	
	

	public static void main(String[] args) {
		int arr[] = {2,1,5,6,2,3};
		System.out.println(Largest(arr));

	}

}
