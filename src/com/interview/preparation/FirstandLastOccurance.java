package com.interview.preparation;

public class FirstandLastOccurance {

	public static int firstOccurance(int arr[], int target) {
		
		int left = 0;
		int right = arr.length-1;
		int result = -1;
		
		while(left<=right) {
			
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				result = mid;
				right = mid -1;
			}
			else if(arr[mid]<target) {
				left = mid + 1;
			}
			else {
				right = mid -1;
			}
			
			
		}
		return result;
	}
	
public static int LastOccurance(int arr[], int target) {
		
		int left = 0;
		int right = arr.length-1;
		int result = -1;
		
		while(left<=right) {
			
			int mid = left + (right - left)/2;
			
			if(arr[mid] == target) {
				result=  mid;
				left = mid+1;
			}
			else if(arr[mid]<target) {
				left = mid + 1;
			}
			else {
				right = mid -1;
			}
			
			
		}
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {

		int arr[] = {10,20,30,30,30,40,50};
		int target = 30;
		
		int firstOccur = firstOccurance(arr,target);
		int lastOccur = LastOccurance(arr,target);
		
		System.out.println(firstOccur);
		System.out.println(lastOccur);
		

	}

}
