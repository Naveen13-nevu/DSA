package rupenet;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int arr [],int key) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			 int mid = low+ (high - low)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			
			else if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			
		}
		
		return -1;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the array element: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the key: ");
		int key = sc.nextInt();
		int result =  search(arr,key);
		 
		 if(result == -1) {
			 System.out.println("Element not found ");
		 }
		 else {
			 System.out.println("element found at index "+ result);
		 }
		
	}

}
