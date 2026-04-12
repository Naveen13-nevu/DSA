package Practice3;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first array size: ");
		int size1 = sc.nextInt();
		System.out.println("Enter the second array size: ");
		int size2 = sc.nextInt();
		
		
		int arr1 []= new int[size1];
		int arr2 []= new int[size2];
		
		System.out.println("Enter first array elements");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter second array elements");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int []result = new int [arr1.length+arr2.length];
		
		int i=0 , j=0, k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++]=arr2[j++];
				
			}
		}
		
		while(i<arr1.length) {
			result[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			result[k++]=arr2[j++];
		}
		
		for(int n:result) {
			System.out.print(n+" ");
		}
		
	}
}
