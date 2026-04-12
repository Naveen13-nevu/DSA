package com.interview.preparation;

import java.util.HashMap;

public class MajorityOfElement {
	
	
	public static int major(int arr[]) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num : arr) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
			
			if(map.get(num) > arr.length/2) {
				return num;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {2,2,3,3,4,5,2,2};
		
		int result = major(arr);
		System.out.println(result);
	}

}
