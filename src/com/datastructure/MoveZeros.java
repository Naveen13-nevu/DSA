package com.datastructure;


public class MoveZeros {
	
	public static void main(String[] args) {
		int nums[]= {0,11,0,3,12};
		int result[]=new int[nums.length];
		int index=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				
				result[index++]=nums[i];
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

 }
