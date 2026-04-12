package com.datastructure;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int arr1 [] = {1,3,5};
		int arr2 [] = {6,7,8};
		
		int result[] = new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++] = arr2[j++];
			}
		}
		
		while(i<arr1.length) {
			result[k++]=arr1[i++];
			
		}

		while(j<arr2.length) {
			result[k++]=arr2[j++];
		}
		
		for(int num:result) {
			System.out.print(num+" ");
		}
		
	}

}
