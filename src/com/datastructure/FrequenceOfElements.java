package com.datastructure;

public class FrequenceOfElements {

	public static void main(String[] args) {

		int nums[]= {1,1,2,2,2,3,3,3,4,4,6};
		
		for(int i=0;i<nums.length;i++) {
			
			int count = 0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
				
			}
			boolean alreadyCounted = false;
			
			for(int k=0;k<i;k++) {
				if(nums[i]==nums[k]) {
					alreadyCounted = true;
				}
				
			}
			if(!alreadyCounted) {
				System.out.println(nums[i]+"= "+count);
			}
			
		}

	}

}
