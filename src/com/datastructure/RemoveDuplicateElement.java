package com.datastructure;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		int  nums [] = {1,1,2,2,3,4,5,6,7};
		
		for(int i=0;i<nums.length;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(nums[i]+" ");
			} 
		}
	}
}
