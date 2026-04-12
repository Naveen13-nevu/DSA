package com.interview.preparation;

public class MinPlatformsNoPlatform {
	
	public static int findPlatforms(int arr[], int dep[]) {
		
		int n = arr.length;
		
		bubbleSort(arr);
		bubbleSort(dep);
		
		int i=0;
		int j=0;
		int platform = 0;
		int maxPlatform = 0;
		while(i<n && j<n) {
			if(arr[i] <= dep[j]) {
				platform++;
				i++;
			}
			else {
				platform --;
				j++;
			}
			if(platform>maxPlatform) {
				maxPlatform = platform;
			}
		}		
		
		return maxPlatform;
	}

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
		  int[] arr = {900, 940, 950, 1100, 1500, 1800};
	      int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

	      int result = findPlatforms(arr,dep);
	      
	      System.out.println("Minimum platform needed is : "+ result);
	      
	}

}
